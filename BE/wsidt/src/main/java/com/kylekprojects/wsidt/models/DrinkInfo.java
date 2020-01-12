package com.kylekprojects.wsidt.models;

public class DrinkInfo {
	private String alternateName;
	private String tags;
	private String video;
	private String iba;
	private boolean creativeCommons; 
	private String thumbnail;
	public String getAlternateName() {
		return alternateName;
	}
	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getIba() {
		return iba;
	}
	public void setIba(String iba) {
		this.iba = iba;
	}
	public boolean isCreativeCommons() {
		return creativeCommons;
	}
	public void setCreativeCommons(boolean creativeCommons) {
		this.creativeCommons = creativeCommons;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alternateName == null) ? 0 : alternateName.hashCode());
		result = prime * result + (creativeCommons ? 1231 : 1237);
		result = prime * result + ((iba == null) ? 0 : iba.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((thumbnail == null) ? 0 : thumbnail.hashCode());
		result = prime * result + ((video == null) ? 0 : video.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DrinkInfo other = (DrinkInfo) obj;
		if (alternateName == null) {
			if (other.alternateName != null)
				return false;
		} else if (!alternateName.equals(other.alternateName))
			return false;
		if (creativeCommons != other.creativeCommons)
			return false;
		if (iba == null) {
			if (other.iba != null)
				return false;
		} else if (!iba.equals(other.iba))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (thumbnail == null) {
			if (other.thumbnail != null)
				return false;
		} else if (!thumbnail.equals(other.thumbnail))
			return false;
		if (video == null) {
			if (other.video != null)
				return false;
		} else if (!video.equals(other.video))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DrinkInfo [alternateName=" + alternateName + ", tags=" + tags + ", video=" + video + ", iba=" + iba
				+ ", creativeCommons=" + creativeCommons + ", thumbnail=" + thumbnail + "]";
	}
	public DrinkInfo(String alternateName, String tags, String video, String iba, boolean creativeCommons,
			String thumbnail) {
		super();
		this.alternateName = alternateName;
		this.tags = tags;
		this.video = video;
		this.iba = iba;
		this.creativeCommons = creativeCommons;
		this.thumbnail = thumbnail;
	}
	public DrinkInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
