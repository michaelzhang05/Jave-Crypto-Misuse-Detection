package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.dycreator.e.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.m;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBButton extends Button implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f18318a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f18319b;

    /* renamed from: c, reason: collision with root package name */
    private String f18320c;

    public MBButton(Context context) {
        super(context);
        this.f18320c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f18318a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f18318a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f18318a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f18318a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f18318a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f18318a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f18318a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f18318a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f18318a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f18318a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f18319b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f18319b.get("mbridgeAttached").booleanValue()) {
            new m.a("mbridgeAttached").a().a(this.f18320c);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f18319b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f18319b.get("mbridgeDetached").booleanValue()) {
            new m.a("mbridgeDetached").a().a(this.f18320c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f18319b = c.a(str);
        if (campaignEx != null) {
            this.f18320c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f18320c = "";
        this.f18318a = c.a(context, attributeSet);
        a.a(this, attributeSet);
        c.a(this.f18318a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18320c = "";
    }
}
