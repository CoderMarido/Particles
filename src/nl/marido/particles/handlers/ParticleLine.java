package nl.marido.particles.handlers;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import nl.marido.particles.Particles;

public class ParticleLine {

	private static Location location;
	private static Effect effect;
	private static Sound sound;
	private static Vector vector;
	private static int speed;
	private static int distance;
	private static boolean collide;

	public ParticleLine(Location location) {
		ParticleLine.location = location;
	}

	public void setEffect(Effect effect) {
		ParticleLine.effect = effect;
	}

	public void setSound(Sound sound) {
		ParticleLine.sound = sound;
	}

	public void setVector(Vector vector) {
		ParticleLine.vector = vector;
	}

	public void setSpeed(int speed) {
		ParticleLine.speed = speed;
	}

	public void setDistance(int distance) {
		ParticleLine.distance = distance;
	}

	public void setCollide(boolean collide) {
		ParticleLine.collide = collide;
	}

	public void spawnParticle() {
		new BukkitRunnable() {
			public void run() {
				distance--;
				location.getWorld().playEffect(location, effect, 50);
				location.getWorld().playSound(location, sound, 1, 1);
				location = location.add(vector);
				if ((location.getBlock().getType().isSolid() && collide) || distance <= 0) {
					cancel();
				}
			}
		}.runTaskTimer(Particles.getInstance(), 0, speed);
	}

}