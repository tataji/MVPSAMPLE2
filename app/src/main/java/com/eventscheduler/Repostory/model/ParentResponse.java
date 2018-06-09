
package com.eventscheduler.Repostory.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParentResponse {

    @SerializedName("PSlist")
    @Expose
    private List<PSlist> pSlist = null;

    public List<PSlist> getPSlist() {
        return pSlist;
    }

    public void setPSlist(List<PSlist> pSlist) {
        this.pSlist = pSlist;
    }

}
