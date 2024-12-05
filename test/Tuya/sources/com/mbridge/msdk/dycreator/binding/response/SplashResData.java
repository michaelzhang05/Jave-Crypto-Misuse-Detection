package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.listener.action.EAction;

/* loaded from: classes4.dex */
public class SplashResData extends BaseRespData {

    /* renamed from: a, reason: collision with root package name */
    private a f18619a;

    /* renamed from: b, reason: collision with root package name */
    private EAction f18620b;

    public a getBaseViewData() {
        return this.f18619a;
    }

    public EAction geteAction() {
        return this.f18620b;
    }

    public void setBaseViewData(a aVar) {
        this.f18619a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f18620b = eAction;
    }
}
