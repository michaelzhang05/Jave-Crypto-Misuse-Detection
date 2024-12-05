package androidx.compose.ui.text.font;

import O5.I;
import O5.r;
import O5.s;
import O5.t;
import O5.x;
import P5.AbstractC1378t;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    public static final /* synthetic */ r access$firstImmediatelyAvailable(List list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1 function1) {
        return firstImmediatelyAvailable(list, typefaceRequest, asyncTypefaceCache, platformFontLoader, function1);
    }

    public static final r firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1 function1) {
        Object loadBlocking;
        Font font;
        Object b8;
        Font font2;
        int size = list.size();
        List list2 = null;
        for (int i8 = 0; i8 < size; i8++) {
            Font font3 = list.get(i8);
            int mo4753getLoadingStrategyPKNRLFQ = font3.mo4753getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m4794equalsimpl0(mo4753getLoadingStrategyPKNRLFQ, companion.m4799getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            loadBlocking = asyncTypefaceResult.m4772unboximpl();
                            font = font3;
                        } else {
                            I i9 = I.f8278a;
                            try {
                                loadBlocking = platformFontLoader.loadBlocking(font3);
                                font = font3;
                                AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, loadBlocking, false, 8, null);
                            } catch (Exception e8) {
                                throw new IllegalStateException("Unable to load font " + font3, e8);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (loadBlocking != null) {
                    return x.a(list2, FontSynthesis_androidKt.m4828synthesizeTypefaceFxwP2eA(typefaceRequest.m4851getFontSynthesisGVVA2EU(), loadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m4850getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m4794equalsimpl0(mo4753getLoadingStrategyPKNRLFQ, companion.m4800getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            b8 = asyncTypefaceResult2.m4772unboximpl();
                            font2 = font3;
                        } else {
                            I i10 = I.f8278a;
                            try {
                                s.a aVar = s.f8302b;
                                b8 = s.b(platformFontLoader.loadBlocking(font3));
                            } catch (Throwable th2) {
                                s.a aVar2 = s.f8302b;
                                b8 = s.b(t.a(th2));
                            }
                            if (s.g(b8)) {
                                b8 = null;
                            }
                            font2 = font3;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, b8, false, 8, null);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (b8 != null) {
                    return x.a(list2, FontSynthesis_androidKt.m4828synthesizeTypefaceFxwP2eA(typefaceRequest.m4851getFontSynthesisGVVA2EU(), b8, font2, typefaceRequest.getFontWeight(), typefaceRequest.m4850getFontStyle_LCdwA()));
                }
            } else if (FontLoadingStrategy.m4794equalsimpl0(mo4753getLoadingStrategyPKNRLFQ, companion.m4798getAsyncPKNRLFQ())) {
                AsyncTypefaceCache.AsyncTypefaceResult m4764get1ASDuI8 = asyncTypefaceCache.m4764get1ASDuI8(font3, platformFontLoader);
                if (m4764get1ASDuI8 == null) {
                    if (list2 == null) {
                        list2 = AbstractC1378t.s(font3);
                    } else {
                        list2.add(font3);
                    }
                } else if (!AsyncTypefaceCache.AsyncTypefaceResult.m4770isPermanentFailureimpl(m4764get1ASDuI8.m4772unboximpl()) && m4764get1ASDuI8.m4772unboximpl() != null) {
                    return x.a(list2, FontSynthesis_androidKt.m4828synthesizeTypefaceFxwP2eA(typefaceRequest.m4851getFontSynthesisGVVA2EU(), m4764get1ASDuI8.m4772unboximpl(), font3, typefaceRequest.getFontWeight(), typefaceRequest.m4850getFontStyle_LCdwA()));
                }
            } else {
                throw new IllegalStateException("Unknown font type " + font3);
            }
        }
        return x.a(list2, function1.invoke(typefaceRequest));
    }
}
