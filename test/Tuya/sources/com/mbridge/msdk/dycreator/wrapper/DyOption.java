package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public class DyOption {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f18712a;

    /* renamed from: b, reason: collision with root package name */
    private File f18713b;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f18714c;

    /* renamed from: d, reason: collision with root package name */
    private DyAdType f18715d;

    /* renamed from: e, reason: collision with root package name */
    private String f18716e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18717f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18718g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18719h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18720i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18721j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18722k;

    /* renamed from: l, reason: collision with root package name */
    private int f18723l;

    /* renamed from: m, reason: collision with root package name */
    private int f18724m;

    /* renamed from: n, reason: collision with root package name */
    private int f18725n;

    /* renamed from: o, reason: collision with root package name */
    private int f18726o;

    /* renamed from: p, reason: collision with root package name */
    private int f18727p;

    /* renamed from: q, reason: collision with root package name */
    private int f18728q;

    /* renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f18729r;

    /* loaded from: classes4.dex */
    public static class Builder implements IViewOptionBuilder {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f18730a;

        /* renamed from: b, reason: collision with root package name */
        private File f18731b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f18732c;

        /* renamed from: d, reason: collision with root package name */
        private DyAdType f18733d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f18734e;

        /* renamed from: f, reason: collision with root package name */
        private String f18735f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f18736g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f18737h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f18738i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f18739j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f18740k;

        /* renamed from: l, reason: collision with root package name */
        private int f18741l;

        /* renamed from: m, reason: collision with root package name */
        private int f18742m;

        /* renamed from: n, reason: collision with root package name */
        private int f18743n;

        /* renamed from: o, reason: collision with root package name */
        private int f18744o;

        /* renamed from: p, reason: collision with root package name */
        private int f18745p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f18735f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f18732c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z8) {
            this.f18734e = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i8) {
            this.f18744o = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f18733d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f18731b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f18730a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z8) {
            this.f18739j = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z8) {
            this.f18737h = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z8) {
            this.f18740k = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z8) {
            this.f18736g = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z8) {
            this.f18738i = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i8) {
            this.f18743n = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i8) {
            this.f18741l = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i8) {
            this.f18742m = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i8) {
            this.f18745p = i8;
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
        this.f18712a = builder.f18730a;
        this.f18713b = builder.f18731b;
        this.f18714c = builder.f18732c;
        this.f18715d = builder.f18733d;
        this.f18718g = builder.f18734e;
        this.f18716e = builder.f18735f;
        this.f18717f = builder.f18736g;
        this.f18719h = builder.f18737h;
        this.f18721j = builder.f18739j;
        this.f18720i = builder.f18738i;
        this.f18722k = builder.f18740k;
        this.f18723l = builder.f18741l;
        this.f18724m = builder.f18742m;
        this.f18725n = builder.f18743n;
        this.f18726o = builder.f18744o;
        this.f18728q = builder.f18745p;
    }

    public String getAdChoiceLink() {
        return this.f18716e;
    }

    public CampaignEx getCampaignEx() {
        return this.f18714c;
    }

    public int getCountDownTime() {
        return this.f18726o;
    }

    public int getCurrentCountDown() {
        return this.f18727p;
    }

    public DyAdType getDyAdType() {
        return this.f18715d;
    }

    public File getFile() {
        return this.f18713b;
    }

    public List<String> getFileDirs() {
        return this.f18712a;
    }

    public int getOrientation() {
        return this.f18725n;
    }

    public int getShakeStrenght() {
        return this.f18723l;
    }

    public int getShakeTime() {
        return this.f18724m;
    }

    public int getTemplateType() {
        return this.f18728q;
    }

    public boolean isApkInfoVisible() {
        return this.f18721j;
    }

    public boolean isCanSkip() {
        return this.f18718g;
    }

    public boolean isClickButtonVisible() {
        return this.f18719h;
    }

    public boolean isClickScreen() {
        return this.f18717f;
    }

    public boolean isLogoVisible() {
        return this.f18722k;
    }

    public boolean isShakeVisible() {
        return this.f18720i;
    }

    public void setDyCountDownListener(int i8) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f18729r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i8);
        }
        this.f18727p = i8;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f18729r = dyCountDownListenerWrapper;
    }
}
