package program.dto;

import java.sql.Date;

public class ProgramDTO {
	private int id;
	private String title;
	private String text;
	private String subtext;
	private String schedule;
	private String img;
	private Date create_date;
	public ProgramDTO() {};
	public ProgramDTO(int id, String title, String text, String subtext, String schedule, String img,
			Date create_date) {
		this.id = id;
		this.title = title;
		this.text = text;
		this.subtext = subtext;
		this.schedule = schedule;
		this.img = img;
		this.create_date = create_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSubtext() {
		return subtext;
	}
	public void setSubtext(String subtext) {
		this.subtext = subtext;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
}
