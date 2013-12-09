package br.com.gabrielmolter.listviewdemos;

public class News {
	
	private String mHeader, mColapsed, mExpanded, mSource, mLink;
	
	public News(String header, String colapsed, String expanded, String source, String link){
		mHeader = header;
		mColapsed = colapsed;
		mExpanded = expanded;
		mSource = source;
		mLink = link;
	}

	public String getHeader() {
		return mHeader;
	}

	public void setHeader(String mHeader) {
		this.mHeader = mHeader;
	}

	public String getExpanded() {
		return mExpanded;
	}

	public void setExpanded(String mExpanded) {
		this.mExpanded = mExpanded;
	}

	public String getColapsed() {
		return mColapsed;
	}

	public void setColapsed(String mColapsed) {
		this.mColapsed = mColapsed;
	}

	public String getSource() {
		return mSource;
	}

	public void setSource(String mSource) {
		this.mSource = mSource;
	}

	public String getLink() {
		return mLink;
	}

	public void setLink(String mLink) {
		this.mLink = mLink;
	}
	

}
