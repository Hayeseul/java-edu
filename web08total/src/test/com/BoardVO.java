package test.com;

import java.util.Date;

public class BoardVO {
	private int num; 
	private String content;
	private String title;
	private String writer;
	private Date wdate;
	private String str_wdate;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public String getStr_wdate() {
		return str_wdate;
	}
	public void setStr_wdate(String str_wdate) {
		this.str_wdate = str_wdate;
		
		
	}
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", content=" + content + ", title=" + title + ", writer=" + writer + ", wdate="
				+ wdate + ", str_wdate=" + str_wdate + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardVO other = (BoardVO) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (num != other.num)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (wdate == null) {
			if (other.wdate != null)
				return false;
		} else if (!wdate.equals(other.wdate))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}
	public void setWdate(String string) {
		// TODO Auto-generated method stub
		
	}

	
	
}
