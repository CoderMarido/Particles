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
	private static int volume = 0;
	private static int pitch = 0.0;
	private static int amount = 0;
	private static int speed;
	private static int distance;
	private static boolean collide;

	public ParticleLine(Location location) {
		this.location = location;
	}

	public static void setEffect(Effect effect) {
		this.effect = effect;
	}

	public static void setAmount(int amount) {
		this.amount = amount;
	}

	public static void setSound(Sound sound) {
		this.sound = sound;
	}

	public static void setVector(Vector vector) {
		this.vector = vector;
	}

	public static void setSpeed(int speed) {
		this.speed = speed;
	}

	public static void setDistance(int distance) {
		this.distance = distance;
	}

	public static void setCollide(boolean collide) {
		this.collide = collide;
	}

	public static void setVolume(int volume) {
		this.volume = volume;
	}

	public static void setPitch(int pitch) {
		this.pitch = pitch;
	}

	public static void spawnParticle() {
		new BukkitRunnable() {
			public void run() {
				distance--;
				location.getWorld().playEffect(location, effect, amount);
				location.getWorld().playSound(location, sound, volume, pitch);
				location = location.add(vector);
				if ((location.getBlock().getType().isSolid() && collide) || distance <= 0) {
					cancel();
				}
			}
		}.runTaskTimer(Particles.getInstance(), 0, speed);
	}

}
