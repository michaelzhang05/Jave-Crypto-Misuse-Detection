package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.listener.action.EAction;

/* loaded from: classes4.dex */
public class SplashResData extends BaseRespData {

    /* renamed from: a, reason: collision with root package name */
    private a f19674a;

    /* renamed from: b, reason: collision with root package name */
    private EAction f19675b;

    public a getBaseViewData() {
        return this.f19674a;
    }

    public EAction geteAction() {
        return this.f19675b;
    }

    public void setBaseViewData(a aVar) {
        this.f19674a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f19675b = eAction;
    }
}
