package androidx.compose.ui.text.font;

import L5.I;
import L5.r;
import L5.x;
import M5.AbstractC1246t;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.DispatcherKt;
import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import i6.J;
import i6.M;
import i6.N;
import i6.O;
import i6.U0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    private M asyncLoadScope;
    private final AsyncTypefaceCache asyncTypefaceCache;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();
    private static final J DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(J.f31714m0);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final J getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.fontMatcher;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Object preload(FontFamily fontFamily, PlatformFontLoader platformFontLoader, P5.d dVar) {
        if (!(fontFamily instanceof FontListFontFamily)) {
            return I.f6487a;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily;
        List<Font> fonts = fontListFontFamily.getFonts();
        List<Font> fonts2 = fontListFontFamily.getFonts();
        ArrayList arrayList = new ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i8 = 0; i8 < size; i8++) {
            Font font = fonts2.get(i8);
            if (FontLoadingStrategy.m4789equalsimpl0(font.mo4748getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m4793getAsyncPKNRLFQ())) {
                arrayList.add(font);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            Font font2 = (Font) arrayList.get(i9);
            arrayList2.add(x.a(font2.getWeight(), FontStyle.m4799boximpl(font2.mo4758getStyle_LCdwA())));
        }
        HashSet hashSet = new HashSet(arrayList2.size());
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj = arrayList2.get(i10);
            if (hashSet.add((r) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        for (int i11 = 0; i11 < size4; i11++) {
            r rVar = (r) arrayList3.get(i11);
            FontWeight fontWeight = (FontWeight) rVar.a();
            int m4805unboximpl = ((FontStyle) rVar.b()).m4805unboximpl();
            List list = (List) FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(fontMatcher.m4798matchFontRetOiIg(fonts, fontWeight, m4805unboximpl), new TypefaceRequest(fontFamily, fontWeight, m4805unboximpl, FontSynthesis.Companion.m4819getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, FontListFontFamilyTypefaceAdapter$preload$2$1.INSTANCE).a();
            if (list != null) {
                arrayList4.add(AbstractC1246t.m0(list));
            }
        }
        Object e8 = N.e(new FontListFontFamilyTypefaceAdapter$preload$3(arrayList4, this, platformFontLoader, null), dVar);
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return I.f6487a;
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1 function1, Function1 function12) {
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        r access$firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(fontMatcher.m4798matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m4845getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, function12);
        List list = (List) access$firstImmediatelyAvailable.a();
        Object b8 = access$firstImmediatelyAvailable.b();
        if (list == null) {
            return new TypefaceResult.Immutable(b8, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, b8, typefaceRequest, this.asyncTypefaceCache, function1, platformFontLoader);
        AbstractC2829k.d(this.asyncLoadScope, null, O.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, P5.g gVar) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = N.a(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(gVar).plus(U0.a((InterfaceC2855x0) gVar.get(InterfaceC2855x0.f31809n0))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, P5.g gVar, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i8 & 2) != 0 ? P5.h.f7994a : gVar);
    }
}
