package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class FontFamilyResolver_androidKt {
    public static final FontFamily.Resolver createFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }

    @InternalTextApi
    public static final FontFamily.Resolver emptyCacheFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, null), null, 18, null);
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final State<android.graphics.Typeface> m4778resolveAsTypefaceWqqsr6A(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i8, int i9) {
        State mo4777resolveDPcqOEQ = resolver.mo4777resolveDPcqOEQ(fontFamily, fontWeight, i8, i9);
        AbstractC3159y.g(mo4777resolveDPcqOEQ, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return mo4777resolveDPcqOEQ;
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ State m4779resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fontFamily = null;
        }
        if ((i10 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i10 & 4) != 0) {
            i8 = FontStyle.Companion.m4809getNormal_LCdwA();
        }
        if ((i10 & 8) != 0) {
            i9 = FontSynthesis.Companion.m4819getAllGVVA2EU();
        }
        return m4778resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i8, i9);
    }

    public static final FontFamily.Resolver createFontFamilyResolver(Context context, P5.g gVar) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), gVar), null, 16, null);
    }
}
