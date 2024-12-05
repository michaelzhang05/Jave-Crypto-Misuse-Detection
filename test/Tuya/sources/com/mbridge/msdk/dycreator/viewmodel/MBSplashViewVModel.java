package com.mbridge.msdk.dycreator.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.dycreator.binding.b;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class MBSplashViewVModel implements BaseViewModel {

    /* renamed from: a, reason: collision with root package name */
    private d f18704a;

    /* renamed from: b, reason: collision with root package name */
    private c f18705b;

    /* renamed from: c, reason: collision with root package name */
    private f f18706c;

    /* renamed from: d, reason: collision with root package name */
    private h f18707d;

    /* renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f18708e;

    /* renamed from: f, reason: collision with root package name */
    private DyOption f18709f;

    /* renamed from: com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18710a;

        static {
            int[] iArr = new int[EAction.values().length];
            f18710a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18710a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBSplashViewVModel(DyOption dyOption) {
        String str;
        this.f18709f = dyOption;
        if (dyOption != null && dyOption.getCampaignEx() != null) {
            str = dyOption.getCampaignEx().getCampaignUnitId();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            EventBus.getDefault().register(str, this);
        } else {
            EventBus.getDefault().register(this);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        if (this.f18708e != null && splashResData != null) {
            int i8 = AnonymousClass1.f18710a[splashResData.geteAction().ordinal()];
            if (i8 == 1 || i8 == 2) {
                try {
                    String str = "";
                    if (splashResData.getBaseViewData() != null && splashResData.getBaseViewData().getBindData() != null) {
                        str = splashResData.getBaseViewData().getBindData().getCampaignUnitId();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        EventBus.getDefault().unregister(str);
                        b.a().b();
                    } else {
                        EventBus.getDefault().unregister(this);
                        b.a().b();
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                    EventBus.getDefault().unregister(this);
                    EventBus.getDefault().release();
                    b.a().b();
                }
            }
            this.f18708e.viewClicked(splashResData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f18705b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f18704a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f18708e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f18706c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        String str;
        String str2;
        MBSplashData mBSplashData = new MBSplashData(this.f18709f);
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (c8 != null) {
            DyOption dyOption = this.f18709f;
            if (dyOption != null) {
                CampaignEx campaignEx = dyOption.getCampaignEx();
                if (campaignEx != null) {
                    mBSplashData.setAdClickText(campaignEx.getAdCall());
                }
                if (this.f18709f.isCanSkip()) {
                    str2 = "mbridge_splash_count_time_can_skip";
                } else {
                    str2 = "mbridge_splash_count_time_can_skip_not";
                }
                mBSplashData.setCountDownText(c8.getResources().getString(v.a(c8, str2, TypedValues.Custom.S_STRING)));
            }
            mBSplashData.setNoticeImage(v.a(c8, "mbridge_splash_notice", "drawable"));
            String s8 = z.s(c8);
            if (!TextUtils.isEmpty(s8) && s8.contains("zh")) {
                str = "广告";
            } else {
                str = "AD";
            }
            mBSplashData.setLogoText(str);
        }
        d dVar = this.f18704a;
        if (dVar != null) {
            dVar.a(mBSplashData);
        }
        c cVar = this.f18705b;
        if (cVar != null) {
            cVar.a(mBSplashData);
        }
        f fVar = this.f18706c;
        if (fVar != null) {
            fVar.a(mBSplashData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f18707d = hVar;
        }
    }
}
