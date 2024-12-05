package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class MBSplashData implements a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f18621a;

    /* renamed from: b, reason: collision with root package name */
    private String f18622b;

    /* renamed from: c, reason: collision with root package name */
    private String f18623c;

    /* renamed from: d, reason: collision with root package name */
    private String f18624d;

    /* renamed from: e, reason: collision with root package name */
    private String f18625e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f18626f;

    /* renamed from: g, reason: collision with root package name */
    private int f18627g;

    /* renamed from: h, reason: collision with root package name */
    private int f18628h;

    /* renamed from: i, reason: collision with root package name */
    private float f18629i;

    /* renamed from: j, reason: collision with root package name */
    private float f18630j;

    /* renamed from: k, reason: collision with root package name */
    private int f18631k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f18621a = dyOption;
        this.f18626f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f18623c;
    }

    public String getAppInfo() {
        return this.f18622b;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public CampaignEx getBindData() {
        return this.f18626f;
    }

    public int getClickType() {
        return this.f18631k;
    }

    public String getCountDownText() {
        return this.f18624d;
    }

    public DyOption getDyOption() {
        return this.f18621a;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public DyOption getEffectData() {
        return this.f18621a;
    }

    public int getLogoImage() {
        return this.f18628h;
    }

    public String getLogoText() {
        return this.f18625e;
    }

    public int getNoticeImage() {
        return this.f18627g;
    }

    public float getxInScreen() {
        return this.f18629i;
    }

    public float getyInScreen() {
        return this.f18630j;
    }

    public void setAdClickText(String str) {
        this.f18623c = str;
    }

    public void setAppInfo(String str) {
        this.f18622b = str;
    }

    public void setClickType(int i8) {
        this.f18631k = i8;
    }

    public void setCountDownText(String str) {
        this.f18624d = str;
    }

    public void setLogoImage(int i8) {
        this.f18628h = i8;
    }

    public void setLogoText(String str) {
        this.f18625e = str;
    }

    public void setNoticeImage(int i8) {
        this.f18627g = i8;
    }

    public void setxInScreen(float f8) {
        this.f18629i = f8;
    }

    public void setyInScreen(float f8) {
        this.f18630j = f8;
    }
}
