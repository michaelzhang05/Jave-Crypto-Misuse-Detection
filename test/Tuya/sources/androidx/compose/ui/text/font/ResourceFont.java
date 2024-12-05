package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i8, FontWeight fontWeight, int i9, @ExperimentalTextApi FontVariation.Settings settings, int i10, AbstractC3151p abstractC3151p) {
        this(i8, fontWeight, i9, settings, i10);
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m4836copyF3nL8kk$default(ResourceFont resourceFont, int i8, FontWeight fontWeight, int i9, int i10, FontVariation.Settings settings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i8 = resourceFont.resId;
        }
        if ((i11 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i11 & 4) != 0) {
            i9 = resourceFont.mo4758getStyle_LCdwA();
        }
        int i12 = i9;
        if ((i11 & 8) != 0) {
            i10 = resourceFont.mo4748getLoadingStrategyPKNRLFQ();
        }
        int i13 = i10;
        if ((i11 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        return resourceFont.m4839copyF3nL8kk(i8, fontWeight2, i12, i13, settings);
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m4837copyRetOiIg$default(ResourceFont resourceFont, int i8, FontWeight fontWeight, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = resourceFont.resId;
        }
        if ((i10 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i10 & 4) != 0) {
            i9 = resourceFont.mo4758getStyle_LCdwA();
        }
        return resourceFont.m4840copyRetOiIg(i8, fontWeight, i9);
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m4838getLoadingStrategyPKNRLFQ$annotations() {
    }

    @ExperimentalTextApi
    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m4839copyF3nL8kk(int i8, FontWeight fontWeight, int i9, int i10, FontVariation.Settings settings) {
        return new ResourceFont(i8, fontWeight, i9, settings, i10, null);
    }

    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m4840copyRetOiIg(int i8, FontWeight fontWeight, int i9) {
        return m4836copyF3nL8kk$default(this, i8, fontWeight, i9, mo4748getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        if (this.resId == resourceFont.resId && AbstractC3159y.d(getWeight(), resourceFont.getWeight()) && FontStyle.m4802equalsimpl0(mo4758getStyle_LCdwA(), resourceFont.mo4758getStyle_LCdwA()) && AbstractC3159y.d(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m4789equalsimpl0(mo4748getLoadingStrategyPKNRLFQ(), resourceFont.mo4748getLoadingStrategyPKNRLFQ())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.font.Font
    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo4748getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo4758getStyle_LCdwA() {
        return this.style;
    }

    @ExperimentalTextApi
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m4803hashCodeimpl(mo4758getStyle_LCdwA())) * 31) + FontLoadingStrategy.m4790hashCodeimpl(mo4748getLoadingStrategyPKNRLFQ())) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4804toStringimpl(mo4758getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m4791toStringimpl(mo4748getLoadingStrategyPKNRLFQ())) + ')';
    }

    private ResourceFont(int i8, FontWeight fontWeight, int i9, FontVariation.Settings settings, int i10) {
        this.resId = i8;
        this.weight = fontWeight;
        this.style = i9;
        this.variationSettings = settings;
        this.loadingStrategy = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ResourceFont(int r8, androidx.compose.ui.text.font.FontWeight r9, int r10, androidx.compose.ui.text.font.FontVariation.Settings r11, int r12, int r13, kotlin.jvm.internal.AbstractC3151p r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            if (r14 == 0) goto La
            androidx.compose.ui.text.font.FontWeight$Companion r9 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r9 = r9.getNormal()
        La:
            r2 = r9
            r9 = r13 & 4
            if (r9 == 0) goto L15
            androidx.compose.ui.text.font.FontStyle$Companion r9 = androidx.compose.ui.text.font.FontStyle.Companion
            int r10 = r9.m4809getNormal_LCdwA()
        L15:
            r3 = r10
            r9 = r13 & 8
            if (r9 == 0) goto L23
            androidx.compose.ui.text.font.FontVariation r9 = androidx.compose.ui.text.font.FontVariation.INSTANCE
            r10 = 0
            androidx.compose.ui.text.font.FontVariation$Setting[] r10 = new androidx.compose.ui.text.font.FontVariation.Setting[r10]
            androidx.compose.ui.text.font.FontVariation$Settings r11 = r9.m4824Settings6EWAqTQ(r2, r3, r10)
        L23:
            r4 = r11
            r9 = r13 & 16
            if (r9 == 0) goto L2e
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r9 = androidx.compose.ui.text.font.FontLoadingStrategy.Companion
            int r12 = r9.m4793getAsyncPKNRLFQ()
        L2e:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.ResourceFont.<init>(int, androidx.compose.ui.text.font.FontWeight, int, androidx.compose.ui.text.font.FontVariation$Settings, int, int, kotlin.jvm.internal.p):void");
    }
}
