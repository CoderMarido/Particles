package nl.marido.particles;

import org.bukkit.plugin.java.JavaPlugin;

import nl.marido.particles.handlers.Updater;

public class Particles extends JavaPlugin {

	public static Particles instance;

	public void onEnable() {
		instance = this;
		System.out.println("Thank you for using the Particles resource.");
		saveDefaultConfig();
		Updater.runChecks();
	}

	public void onDisable() {
		System.out.println("Thank you for using the Particles resource.");
	}

	public static Particles getInstance() {
		return instance;
	}

}