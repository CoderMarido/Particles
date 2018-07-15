## Particles
Particles is an amazing useful library for developers which mostly want to create their own minigame with custom particles. Particles will easily let you create particle trails and even spheres and cubois in the future when I have enough time.
> **Note:**  Particles will probably have support for cuboids and spheres in the future.
</br>
 
## Developers
Here is an example with built-in methods for developers that want to use Particles to build and create trails.
```ruby
# Create a ParticleLine object with a location to build on.
ParticleLine example = new ParticleLine(location);

# Edit the effect for the example ParticleLine.
example.setEffect(effect);

# Edit the sound for the example ParticleLine.
example.setSound(sound); 

# Edit the vector for the example ParticleLine.
example.setVector(vector); 

# Edit the travel speed for the example ParticleLine.
example.setSpeed(speed); 

# Edit the maximum distance for the example ParticleLine.
example.setDistance(distance); 

# Set colliding with blocks for the example ParticleLine.
example.setCollide(collide); 

# And finally you can spawn the particle with the data.
example.spawnParticle();
```