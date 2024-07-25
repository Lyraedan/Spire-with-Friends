package Lyraedan.networking.eos;

import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Texture;
import com.bearwaves.eos4j.EOS;

import chronoMods.TogetherManager.mode;
import chronoMods.network.Integration;
import chronoMods.network.Packet;
import chronoMods.network.RemotePlayer;

public class EOSIntegration implements Integration {
	
	boolean initialized = false;
	
	@Override
	public void createLobby(mode arg0) {
		
	}

	@Override
	public void initialize() {
		if (!EOS.loadLibraries()) {
			initialized = false;
			return;
		}
		Log("EOS initialized!");
		initialized = true;
	}

	@Override
	public boolean isInitialized() {
		return initialized;
	}

	@Override
	public RemotePlayer makeCurrentUser() {
		return null;
	}

	@Override
	public void updateLobbyData() {
		
	}

	@Override
	public void setLobbyPrivate(boolean priv) {
		
	}

	@Override
	public void getLobbies() {
		
	}

	@Override
	public void getPacket(Packet packet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendPacket(ByteBuffer data) {
		
	}

	@Override
	public void messageUser(RemotePlayer player) {
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public Texture getLogo() {
		return null;
	}
	
	public static void Log(String msg) {
		System.out.println("[EOS] " + msg);
	}


}
