package androidx.compose.ui.text.font;

import L5.I;
import L5.r;
import L5.s;
import L5.t;
import L5.x;
import M5.AbstractC1246t;
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
            int mo4748getLoadingStrategyPKNRLFQ = font3.mo4748getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m4789equalsimpl0(mo4748getLoadingStrategyPKNRLFQ, companion.m4794getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            loadBlocking = asyncTypefaceResult.m4767unboximpl();
                            font = font3;
                        } else {
                            I i9 = I.f6487a;
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
                    return x.a(list2, FontSynthesis_androidKt.m4823synthesizeTypefaceFxwP2eA(typefaceRequest.m4846getFontSynthesisGVVA2EU(), loadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m4845getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m4789equalsimpl0(mo4748getLoadingStrategyPKNRLFQ, companion.m4795getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            b8 = asyncTypefaceResult2.m4767unboximpl();
                            font2 = font3;
                        } else {
                            I i10 = I.f6487a;
                            try {
                                s.a aVar = s.f6511b;
                                b8 = s.b(platformFontLoader.loadBlocking(font3));
                            } catch (Throwable th2) {
                                s.a aVar2 = s.f6511b;
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
                    return x.a(list2, FontSynthesis_androidKt.m4823synthesizeTypefaceFxwP2eA(typefaceRequest.m4846getFontSynthesisGVVA2EU(), b8, font2, typefaceRequest.getFontWeight(), typefaceRequest.m4845getFontStyle_LCdwA()));
                }
            } else if (FontLoadingStrategy.m4789equalsimpl0(mo4748getLoadingStrategyPKNRLFQ, companion.m4793getAsyncPKNRLFQ())) {
                AsyncTypefaceCache.AsyncTypefaceResult m4759get1ASDuI8 = asyncTypefaceCache.m4759get1ASDuI8(font3, platformFontLoader);
                if (m4759get1ASDuI8 == null) {
                    if (list2 == null) {
                        list2 = AbstractC1246t.s(font3);
                    } else {
                        list2.add(font3);
                    }
                } else if (!AsyncTypefaceCache.AsyncTypefaceResult.m4765isPermanentFailureimpl(m4759get1ASDuI8.m4767unboximpl()) && m4759get1ASDuI8.m4767unboximpl() != null) {
                    return x.a(list2, FontSynthesis_androidKt.m4823synthesizeTypefaceFxwP2eA(typefaceRequest.m4846getFontSynthesisGVVA2EU(), m4759get1ASDuI8.m4767unboximpl(), font3, typefaceRequest.getFontWeight(), typefaceRequest.m4845getFontStyle_LCdwA()));
                }
            } else {
                throw new IllegalStateException("Unknown font type " + font3);
            }
        }
        return x.a(list2, function1.invoke(typefaceRequest));
    }
}
