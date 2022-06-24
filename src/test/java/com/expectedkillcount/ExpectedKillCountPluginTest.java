package com.expectedkillcount;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ExpectedKillCountPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ExpectedKillCountPlugin.class);
		RuneLite.main(args);
	}
}