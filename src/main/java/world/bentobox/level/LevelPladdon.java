package world.bentobox.level;

import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Plugin;

import world.bentobox.bentobox.api.addons.Addon;
import world.bentobox.bentobox.api.addons.Pladdon;


/**
 * @author tastybento
 *
 */
@Plugin(name="Level", version="1.0")
@ApiVersion(ApiVersion.Target.v1_16)
public class LevelPladdon extends Pladdon {
    @Override
    public Addon getAddon() {
        return new Level();
    }
}
