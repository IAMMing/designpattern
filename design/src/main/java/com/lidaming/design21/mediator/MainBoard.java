package com.lidaming.design21.mediator;

public class MainBoard implements IMediator {

	private CDDriver cd;
	private CPU cpu;
	private SoundCard sound;
	private VedioCard vedio;
	
	public void changed(Colleage c) {
		if(c.getClass().getSimpleName().equals(CDDriver.class.getSimpleName()))
		{
			CDDriver cdd=(CDDriver)c;
			cpu.processData(cdd.getData());
		}
		else if(c.getClass().getSimpleName().equals(CPU.class.getSimpleName()))
		{
			CPU cp=(CPU)c;
			String soundData = cp.getSoundData();
			String vedioData = cp.getVedioData();
			
			sound.soundData(soundData);
			vedio.showData(vedioData);
		}
	}

	public CDDriver getCd() {
		return cd;
	}

	public void setCd(CDDriver cd) {
		this.cd = cd;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public SoundCard getSound() {
		return sound;
	}

	public void setSound(SoundCard sound) {
		this.sound = sound;
	}

	public VedioCard getVedio() {
		return vedio;
	}

	public void setVedio(VedioCard vedio) {
		this.vedio = vedio;
	}

}
