package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public class DyOption {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f19767a;

    /* renamed from: b, reason: collision with root package name */
    private File f19768b;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f19769c;

    /* renamed from: d, reason: collision with root package name */
    private DyAdType f19770d;

    /* renamed from: e, reason: collision with root package name */
    private String f19771e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19772f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19773g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19774h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19775i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19776j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19777k;

    /* renamed from: l, reason: collision with root package name */
    private int f19778l;

    /* renamed from: m, reason: collision with root package name */
    private int f19779m;

    /* renamed from: n, reason: collision with root package name */
    private int f19780n;

    /* renamed from: o, reason: collision with root package name */
    private int f19781o;

    /* renamed from: p, reason: collision with root package name */
    private int f19782p;

    /* renamed from: q, reason: collision with root package name */
    private int f19783q;

    /* renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f19784r;

    /* loaded from: classes4.dex */
    public static class Builder implements IViewOptionBuilder {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f19785a;

        /* renamed from: b, reason: collision with root package name */
        private File f19786b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f19787c;

        /* renamed from: d, reason: collision with root package name */
        private DyAdType f19788d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f19789e;

        /* renamed from: f, reason: collision with root package name */
        private String f19790f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f19791g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f19792h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f19793i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f19794j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f19795k;

        /* renamed from: l, reason: collision with root package name */
        private int f19796l;

        /* renamed from: m, reason: collision with root package name */
        private int f19797m;

        /* renamed from: n, reason: collision with root package name */
        private int f19798n;

        /* renamed from: o, reason: collision with root package name */
        private int f19799o;

        /* renamed from: p, reason: collision with root package name */
        private int f19800p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f19790f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f19787c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z8) {
            this.f19789e = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i8) {
            this.f19799o = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f19788d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f19786b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f19785a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z8) {
            this.f19794j = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z8) {
            this.f19792h = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z8) {
            this.f19795k = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z8) {
            this.f19791g = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z8) {
            this.f19793i = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i8) {
            this.f19798n = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i8) {
            this.f19796l = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i8) {
            this.f19797m = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i8) {
            this.f19800p = i8;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z8);

        IViewOptionBuilder countDownTime(int i8);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z8);

        IViewOptionBuilder isClickButtonVisible(boolean z8);

        IViewOptionBuilder isLogoVisible(boolean z8);

        IViewOptionBuilder isScreenClick(boolean z8);

        IViewOptionBuilder isShakeVisible(boolean z8);

        IViewOptionBuilder orientation(int i8);

        IViewOptionBuilder shakeStrenght(int i8);

        IViewOptionBuilder shakeTime(int i8);

        IViewOptionBuilder templateType(int i8);
    }

    public DyOption(Builder builder) {
        this.f19767a = builder.f19785a;
        this.f19768b = builder.f19786b;
        this.f19769c = builder.f19787c;
        this.f19770d = builder.f19788d;
        this.f19773g = builder.f19789e;
        this.f19771e = builder.f19790f;
        this.f19772f = builder.f19791g;
        this.f19774h = builder.f19792h;
        this.f19776j = builder.f19794j;
        this.f19775i = builder.f19793i;
        this.f19777k = builder.f19795k;
        this.f19778l = builder.f19796l;
        this.f19779m = builder.f19797m;
        this.f19780n = builder.f19798n;
        this.f19781o = builder.f19799o;
        this.f19783q = builder.f19800p;
    }

    public String getAdChoiceLink() {
        return this.f19771e;
    }

    public CampaignEx getCampaignEx() {
        return this.f19769c;
    }

    public int getCountDownTime() {
        return this.f19781o;
    }

    public int getCurrentCountDown() {
        return this.f19782p;
    }

    public DyAdType getDyAdType() {
        return this.f19770d;
    }

    public File getFile() {
        return this.f19768b;
    }

    public List<String> getFileDirs() {
        return this.f19767a;
    }

    public int getOrientation() {
        return this.f19780n;
    }

    public int getShakeStrenght() {
        return this.f19778l;
    }

    public int getShakeTime() {
        return this.f19779m;
    }

    public int getTemplateType() {
        return this.f19783q;
    }

    public boolean isApkInfoVisible() {
        return this.f19776j;
    }

    public boolean isCanSkip() {
        return this.f19773g;
    }

    public boolean isClickButtonVisible() {
        return this.f19774h;
    }

    public boolean isClickScreen() {
        return this.f19772f;
    }

    public boolean isLogoVisible() {
        return this.f19777k;
    }

    public boolean isShakeVisible() {
        return this.f19775i;
    }

    public void setDyCountDownListener(int i8) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f19784r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i8);
        }
        this.f19782p = i8;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f19784r = dyCountDownListenerWrapper;
    }
}
