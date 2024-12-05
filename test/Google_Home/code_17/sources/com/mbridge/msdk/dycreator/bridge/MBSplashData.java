package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class MBSplashData implements a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f19676a;

    /* renamed from: b, reason: collision with root package name */
    private String f19677b;

    /* renamed from: c, reason: collision with root package name */
    private String f19678c;

    /* renamed from: d, reason: collision with root package name */
    private String f19679d;

    /* renamed from: e, reason: collision with root package name */
    private String f19680e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f19681f;

    /* renamed from: g, reason: collision with root package name */
    private int f19682g;

    /* renamed from: h, reason: collision with root package name */
    private int f19683h;

    /* renamed from: i, reason: collision with root package name */
    private float f19684i;

    /* renamed from: j, reason: collision with root package name */
    private float f19685j;

    /* renamed from: k, reason: collision with root package name */
    private int f19686k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f19676a = dyOption;
        this.f19681f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f19678c;
    }

    public String getAppInfo() {
        return this.f19677b;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public CampaignEx getBindData() {
        return this.f19681f;
    }

    public int getClickType() {
        return this.f19686k;
    }

    public String getCountDownText() {
        return this.f19679d;
    }

    public DyOption getDyOption() {
        return this.f19676a;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public DyOption getEffectData() {
        return this.f19676a;
    }

    public int getLogoImage() {
        return this.f19683h;
    }

    public String getLogoText() {
        return this.f19680e;
    }

    public int getNoticeImage() {
        return this.f19682g;
    }

    public float getxInScreen() {
        return this.f19684i;
    }

    public float getyInScreen() {
        return this.f19685j;
    }

    public void setAdClickText(String str) {
        this.f19678c = str;
    }

    public void setAppInfo(String str) {
        this.f19677b = str;
    }

    public void setClickType(int i8) {
        this.f19686k = i8;
    }

    public void setCountDownText(String str) {
        this.f19679d = str;
    }

    public void setLogoImage(int i8) {
        this.f19683h = i8;
    }

    public void setLogoText(String str) {
        this.f19680e = str;
    }

    public void setNoticeImage(int i8) {
        this.f19682g = i8;
    }

    public void setxInScreen(float f8) {
        this.f19684i = f8;
    }

    public void setyInScreen(float f8) {
        this.f19685j = f8;
    }
}
