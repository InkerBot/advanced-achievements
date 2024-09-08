package com.hm.achievement.module;

import javax.inject.Singleton;

import com.hm.achievement.utils.ref.R$MappingEnvironment;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;

import dagger.Module;
import dagger.Provides;

@Module
public class ServerVersionModule {

	@Provides
	@Singleton
	int provideServerVersion() {
		String versionIdentifier;

		if (R$MappingEnvironment.hasPaperMapping()) {
			versionIdentifier = R$MappingEnvironment.legacyCBVersion();
		} else {
			versionIdentifier = Bukkit.getServer().getClass().getName().split("\\.")[3];
		}

		return Integer.parseInt(StringUtils.substringBetween(versionIdentifier, "_"));
	}

}
