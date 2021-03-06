/*
 * Copyright 2016 Matthew Stone and Romario Maxwell.
 *
 * This file is part of OurVLE.
 *
 * OurVLE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OurVLE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OurVLE.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.stoneapp.ourvlemoodle2.models;

import java.util.ArrayList;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;
import com.google.gson.annotations.SerializedName;
import com.orm.dsl.Ignore;


@Table(name="Course")
public class Course extends Model{


    @SerializedName("id")
    @Column(name="courseid")
    int courseid;

    @Column(name="shortname")
    @SerializedName("shortname")
    String shortname;

    @Column(name="fullname")
    @SerializedName("fullname")
    String fullname;

    @SerializedName("categoryid")
    int categoryid;

    @SerializedName("categorysortorder")
    int categorysortorder;



    @SerializedName("idnumber")
    String idnumber;

    @SerializedName("summary")
    String summary;

    @SerializedName("summaryformat")
    int summaryformat;

    @SerializedName("format")
    String format;

    @SerializedName("showgrades")
    int showgrades;

    @SerializedName("newsitems")
    int newsitems;

    @SerializedName("startdate")
    int startdate;

    @SerializedName("numsections")
    int numsections;

    @SerializedName("maxbytes")
    int maxbytes;

    @SerializedName("showreports")
    int showreports;

    @SerializedName("visible")
    int visible;

    @SerializedName("hiddensections")
    int hiddensections;

    @SerializedName("groupmode")
    int groupmode;

    @SerializedName("groupmodeforce")
    int groupmodeforce;

    @SerializedName("defaultgroupingid")
    int defaultgroupingid;

    @SerializedName("timecreated")
    int timecreated;

    @SerializedName("timemodified")
    int timemodified;

    @SerializedName("enablecompletion")
    int enablecompletion;

    @SerializedName("completionnotify")
    int completionnotify;

    @SerializedName("lang")
    String lang;

    @SerializedName("forcetheme")
    String forcetheme;

    @Ignore
    @SerializedName("courseformatoptions")
    ArrayList<MoodleCourseFormatOption> courseformatoptions;

    // Errors. Not to be stored in sql db.
    @Ignore
    @SerializedName("exception")
    String exception;

    @Ignore
    @SerializedName("errorcode")
    String errorcode;

    @Ignore
    @SerializedName("message")
    String message;

    @Ignore
    @SerializedName("debuginfo")
    String debuginfo;

    // Relational fields
    long siteid;
    Boolean isUserCourse = false;
    Boolean isFavCourse = false;

    public Course() {
        super();

    }

    /**
     * siteid is unique for a moodle address + user combination
     *
     * @param siteid
     *            siteid of the Moodle account to which this course belongs to.
     */
    public Course(long siteid) {
        super();
        this.siteid = siteid;
    }

    public int getCourseid() {
        return courseid;
    }

    public String getShortname() {
        return shortname;
    }

    public int getCategoryid() {
        return categoryid;
    }

    /**
     * sort order into the category
     *
     * @return
     */
    public int getCategorysortorder() {
        return categorysortorder;
    }

    public String getFullname() {
        return fullname;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public String getSummary() {
        return summary;
    }

    /**
     * summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN or 4 = MARKDOWN)
     *
     * @return
     */
    public int getSummaryformat() {
        return summaryformat;
    }

    /**
     * course format: weeks, topics, social, site,..
     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * 1 if grades are shown, otherwise 0
     *
     * @return
     */
    public int getShowgrades() {
        return showgrades;
    }

    /**
     * number of recent items appearing on the course page
     *
     * @return
     */
    public int getNewsitems() {
        return newsitems;
    }

    /**
     * timestamp when the course start
     *
     * @return
     */
    public int getStartdate() {
        return startdate;
    }

    /**
     * (deprecated, use courseformatoptions) number of weeks/topics
     *
     * @return
     */
    public int getNumsections() {
        return numsections;
    }

    /**
     * largest size of file that can be uploaded into the course
     *
     * @return
     */
    public int getMaxbytes() {
        return maxbytes;
    }

    /**
     * are activity report shown (yes = 1, no =0)
     *
     * @return
     */
    public int getShowreports() {
        return showreports;
    }

    /**
     * 1: available to student, 0:not available
     *
     * @return
     */
    public int getVisible() {
        return visible;
    }

    /**
     * (deprecated, use courseformatoptions) How the hidden sections in the
     * course are displayed to students
     *
     * @return
     */
    public int getHiddensections() {
        return hiddensections;
    }

    /**
     * no group, separate, visible
     *
     * @return
     */
    public int getGroupmode() {
        return groupmode;
    }

    /**
     * 1: yes, 0: no
     *
     * @return
     */
    public int getGroupmodeforce() {
        return groupmodeforce;
    }

    /**
     * default grouping id
     *
     * @return
     */
    public int getDefaultgroupingid() {
        return defaultgroupingid;
    }

    /**
     * timestamp when the course have been created
     *
     * @return
     */
    public int getTimecreated() {
        return timecreated;
    }

    /**
     * timestamp when the course have been modified
     *
     * @return
     */
    public int getTimemodified() {
        return timemodified;
    }

    /**
     * Enabled, control via completion and activity settings. Disbaled, not
     * shown in activity settings.
     *
     * @return
     */
    public int getEnablecompletion() {
        return enablecompletion;
    }

    /**
     * 1: yes 0: no
     *
     * @return
     */
    public int getCompletionnotify() {
        return completionnotify;
    }

    /**
     * forced course language
     *
     * @return
     */
    public String getLang() {
        return lang;
    }

    /**
     * name of the force theme
     *
     * @return
     */
    public String getForcetheme() {
        return forcetheme;
    }

    /**
     * additional options for particular course format
     *
     * @return
     */
    public ArrayList<MoodleCourseFormatOption> getCourseformatoptions() {
        return courseformatoptions;
    }

    /**
     * Exception occurred while retrieving
     *
     * @return
     */
    public String getException() {
        return exception;
    }

    /**
     * Errorcode of error occurred while retrieving
     *
     * @return
     */
    public String getErrorcode() {
        return errorcode;
    }

    /**
     * Message of error occurred while retrieving
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * Debug info on the error occurred
     *
     * @return
     */
    public String getDebuginfo() {
        return debuginfo;
    }

    /**
     * Get if this course is enrolled by current user
     *
     * @return
     */
    public Boolean getIsUserCourse() {
        return isUserCourse;
    }

    /**
     * Set if this course is enrolled by current user
     *
     * @return
     */
    public void setIsUserCourse(Boolean isUserCourse) {
        this.isUserCourse = isUserCourse;
    }

    /**
     * Get favourite status course in the app
     *
     * @return
     */
    public Boolean getIsFavCourse() {
        return isFavCourse;
    }

    /**
     * Set favourite status course in the app
     *
     * @return
     */
    public void setIsFavCourse(Boolean isFavCourse) {
        this.isFavCourse = isFavCourse;
    }

    /**
     * Get the siteid of this course
     *
     * @return
     */
    public long getSiteid() {
        return siteid;
    }

    /**
     * set the site id of this course
     *
     * @param siteid
     */
    public void setSiteid(long siteid) {
        this.siteid = siteid;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public static Course findOrCreateFromJson(Course new_course) {
        int courseid = new_course.getCourseid();
        Course existingCourse =
                new Select().from(Course.class).where("courseid = ?", courseid).executeSingle();
        if (existingCourse != null) {
            // found and return existing
            UpdateCourse(existingCourse,new_course);
            return existingCourse;
        } else {
            // create and return new user
            Course course = new_course;
            course.save();
            return course;
        }
    }

    private static void UpdateCourse(Course old_course, Course new_course)
    {
        old_course.setFullname(new_course.getFullname());
        old_course.setShortname(new_course.getShortname());
        old_course.save();

    }
}
