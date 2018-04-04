package com.senpai.util;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatBasic;
import net.minecraft.util.text.TextComponentTranslation;

public class StatList {

	public static net.minecraft.stats.StatList MinecraftList;
	//Custom
	public static final StatBase PIPE_INTERACTION = (new StatBasic("stat.pipeInteraction", new TextComponentTranslation("stat.pipeInteraction", new Object[0]))).registerStat();
}
