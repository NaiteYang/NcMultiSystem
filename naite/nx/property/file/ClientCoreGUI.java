package nx.property.file;

import java.io.File;

import nx.property.core.Core;
import org.bukkit.configuration.file.YamlConfiguration;

public class ClientCoreGUI{
	private static YamlConfiguration yaml = null;
	private static File file = null;

	// reload
	public static void reloadCoreGUI(){
		if(file == null){
			file = new File(Core.plugin.getDataFolder() + File.separator + "Interface" + File.separator + "coregui.yml");
		}
		yaml = LanguageFileManager.loadFile(file, "Interface/coregui.yml");
	}

	// getConfig
	public static YamlConfiguration getCoreGUI(){
		if(yaml == null){
			reloadCoreGUI();
		}
		return yaml;
	}

	// save
	public static void saveCoreGUI(){
		if((yaml == null) || (file == null)){
			return;
		}
		LanguageFileManager.saveFile(file, yaml);
	}
}
