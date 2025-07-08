
public class EscapeEnemy extends Enemy {
	public EscapeEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life = 2 + GameWorld.stage;
		score = 30 + (GameWorld.stage * 5); 
	}

	public void draw(MyFrame f) {
				int goldR = 255, goldG = 215, goldB = 0;
		for (int i = 0; i < 3; i++) {
			f.setColor(goldR - i * 20, goldG - i * 15, goldB);
			f.fillOval((int)(x + i * 2), (int)(y + i * 2), 30 - i * 5, 30 - i * 5);
		}

		f.setColor(255, 255, 255);
		f.fillOval((int)(x + 8), (int)(y + 8), 5, 5);
	}

	public void move() {
		super.move();
		
		if (x < GameWorld.player.x) {
			x -= GameWorld.stage; 
			vx = -GameWorld.stage;
		}
		if (x > GameWorld.player.x) {
			x += GameWorld.stage;
			vx = GameWorld.stage;
		}
	}
}