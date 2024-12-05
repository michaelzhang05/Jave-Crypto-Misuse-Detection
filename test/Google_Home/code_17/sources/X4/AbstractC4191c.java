package x4;

import O5.I;
import O5.r;
import O5.s;
import O5.t;
import O5.x;
import P5.AbstractC1378t;
import P5.Q;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Spanned;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.text.HtmlCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3354f;
import l6.AbstractC3364k;
import l6.M;
import l6.U;
import o6.AbstractC3700N;
import o6.w;
import v4.AbstractC4107f;
import v4.AbstractC4111j;
import v4.C4108g;
import x4.AbstractC4190b;

/* renamed from: x4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4191c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40683a = new a();

        a() {
            super(1);
        }

        public final void invoke(TextLayoutResult it) {
            AbstractC3255y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextLayoutResult) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f40684a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f40685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState, Function1 function1) {
            super(1);
            this.f40684a = mutableState;
            this.f40685b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextLayoutResult) obj);
            return I.f8278a;
        }

        public final void invoke(TextLayoutResult it) {
            AbstractC3255y.i(it, "it");
            this.f40684a.setValue(it);
            this.f40685b.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0927c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f40686a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f40687b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f40688c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f40689d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f40690e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f40691f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f40692g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f40693h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f40694i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f40695j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f40696k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f40697l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0927c(AnnotatedString annotatedString, long j8, TextStyle textStyle, Modifier modifier, Map map, boolean z8, int i8, int i9, Function1 function1, Function1 function12, int i10, int i11) {
            super(2);
            this.f40686a = annotatedString;
            this.f40687b = j8;
            this.f40688c = textStyle;
            this.f40689d = modifier;
            this.f40690e = map;
            this.f40691f = z8;
            this.f40692g = i8;
            this.f40693h = i9;
            this.f40694i = function1;
            this.f40695j = function12;
            this.f40696k = i10;
            this.f40697l = i11;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4191c.a(this.f40686a, this.f40687b, this.f40688c, this.f40689d, this.f40690e, this.f40691f, this.f40692g, this.f40693h, this.f40694i, this.f40695j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40696k | 1), this.f40697l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f40698a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f40699b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f40700c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f40701d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x4.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f40702a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f40703b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MutableState mutableState, Function1 function1) {
                super(1);
                this.f40702a = mutableState;
                this.f40703b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m5628invokek4lQ0M(((Offset) obj).m2750unboximpl());
                return I.f8278a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m5628invokek4lQ0M(long j8) {
                List<Rect> placeholderRects;
                List j02;
                Object obj;
                TextLayoutResult textLayoutResult = (TextLayoutResult) this.f40702a.getValue();
                if (textLayoutResult != null && (placeholderRects = textLayoutResult.getPlaceholderRects()) != null && (j02 = AbstractC1378t.j0(placeholderRects)) != null) {
                    Iterator it = j02.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Rect rect = (Rect) obj;
                            if (Offset.m2740getXimpl(j8) > Offset.m2740getXimpl(rect.m2775getTopLeftF1C5BW0()) && Offset.m2740getXimpl(j8) < Offset.m2740getXimpl(rect.m2776getTopRightF1C5BW0())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    Rect rect2 = (Rect) obj;
                    if (rect2 != null) {
                        j8 = Offset.m2734copydBAh8RU$default(rect2.m2776getTopRightF1C5BW0(), Offset.m2740getXimpl(rect2.m2776getTopRightF1C5BW0()) + 0.1f, 0.0f, 2, null);
                    }
                }
                if (((TextLayoutResult) this.f40702a.getValue()) != null) {
                    this.f40703b.invoke(Integer.valueOf(r0.m4669getOffsetForPositionk4lQ0M(j8) - 1));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MutableState mutableState, Function1 function1, S5.d dVar) {
            super(2, dVar);
            this.f40700c = mutableState;
            this.f40701d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            d dVar2 = new d(this.f40700c, this.f40701d, dVar);
            dVar2.f40699b = obj;
            return dVar2;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(PointerInputScope pointerInputScope, S5.d dVar) {
            return ((d) create(pointerInputScope, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f40698a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f40699b;
                a aVar = new a(this.f40700c, this.f40701d);
                this.f40698a = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, aVar, this, 7, null) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f40704a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5629invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5629invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f40705a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f40706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f40707c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z8, Function0 function0, Context context) {
            super(1);
            this.f40705a = z8;
            this.f40706b = function0;
            this.f40707c = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return I.f8278a;
        }

        public final void invoke(List annotatedStringRanges) {
            AbstractC3255y.i(annotatedStringRanges, "annotatedStringRanges");
            if (this.f40705a) {
                this.f40706b.invoke();
                AnnotatedString.Range range = (AnnotatedString.Range) AbstractC1378t.o0(annotatedStringRanges);
                if (range != null) {
                    Context context = this.f40707c;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse((String) range.getItem()));
                    context.startActivity(intent);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40708a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f40709b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f40710c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f40711d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f40712e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f40713f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ SpanStyle f40714g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f40715h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f40716i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f40717j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f40718k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Modifier modifier, Map map, long j8, TextStyle textStyle, boolean z8, SpanStyle spanStyle, int i8, Function0 function0, int i9, int i10) {
            super(2);
            this.f40708a = str;
            this.f40709b = modifier;
            this.f40710c = map;
            this.f40711d = j8;
            this.f40712e = textStyle;
            this.f40713f = z8;
            this.f40714g = spanStyle;
            this.f40715h = i8;
            this.f40716i = function0;
            this.f40717j = i9;
            this.f40718k = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4191c.b(this.f40708a, this.f40709b, this.f40710c, this.f40711d, this.f40712e, this.f40713f, this.f40714g, this.f40715h, this.f40716i, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40717j | 1), this.f40718k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f40719a = new h();

        h() {
            super(1);
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f40720a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f40721b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1, AnnotatedString annotatedString) {
            super(1);
            this.f40720a = function1;
            this.f40721b = annotatedString;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return I.f8278a;
        }

        public final void invoke(int i8) {
            this.f40720a.invoke(this.f40721b.getStringAnnotations("URL", i8, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40722a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f40723b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f40724c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f40725d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f40726e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SpanStyle f40727f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f40728g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f40729h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f40730i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f40731j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Modifier modifier, Map map, long j8, TextStyle textStyle, SpanStyle spanStyle, int i8, Function1 function1, int i9, int i10) {
            super(2);
            this.f40722a = str;
            this.f40723b = modifier;
            this.f40724c = map;
            this.f40725d = j8;
            this.f40726e = textStyle;
            this.f40727f = spanStyle;
            this.f40728g = i8;
            this.f40729h = function1;
            this.f40730i = i9;
            this.f40731j = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4191c.c(this.f40722a, this.f40723b, this.f40724c, this.f40725d, this.f40726e, this.f40727f, this.f40728g, this.f40729h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40730i | 1), this.f40731j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f40732a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(MutableState mutableState) {
            super(0);
            this.f40732a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5630invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5630invoke() {
            this.f40732a.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4190b.a f40733a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Painter f40734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(AbstractC4190b.a aVar, Painter painter) {
            super(3);
            this.f40733a = aVar;
            this.f40734b = painter;
        }

        public final void a(String it, Composer composer, int i8) {
            AbstractC3255y.i(it, "it");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-737684954, i8, -1, "com.stripe.android.uicore.text.rememberDrawableImages.<anonymous>.<anonymous> (Html.kt:95)");
            }
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 1, null);
            ImageKt.Image(this.f40734b, StringResources_androidKt.stringResource(this.f40733a.b(), composer, 0), fillMaxHeight$default, (Alignment) null, (ContentScale) null, 0.0f, this.f40733a.a(), composer, 392, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((String) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.c$m */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f40735a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f40736b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f40737c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f40738d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f40739e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C4108g f40740f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Density f40741g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f40742h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x4.c$m$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Map.Entry f40743a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4108g f40744b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f40745c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Map.Entry entry, C4108g c4108g, long j8) {
                super(3);
                this.f40743a = entry;
                this.f40744b = c4108g;
                this.f40745c = j8;
            }

            public final void a(String it, Composer composer, int i8) {
                AbstractC3255y.i(it, "it");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(858918421, i8, -1, "com.stripe.android.uicore.text.rememberRemoteImages.<anonymous>.<anonymous>.<anonymous> (Html.kt:186)");
                }
                AbstractC4107f.a((String) this.f40743a.getKey(), this.f40744b, null, SizeKt.m638height3ABfNKs(SizeKt.m657width3ABfNKs(Modifier.Companion, Dp.m5183constructorimpl(Size.m2809getWidthimpl(this.f40745c))), Dp.m5183constructorimpl(Size.m2806getHeightimpl(this.f40745c))), null, null, null, null, false, null, null, composer, 448, 0, 2032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // a6.InterfaceC1669o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((String) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x4.c$m$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            Object f40746a;

            /* renamed from: b, reason: collision with root package name */
            int f40747b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AnnotatedString.Range f40748c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C4108g f40749d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AnnotatedString.Range range, C4108g c4108g, S5.d dVar) {
                super(2, dVar);
                this.f40748c = range;
                this.f40749d = c4108g;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f40748c, this.f40749d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object obj3;
                Object e8 = T5.b.e();
                int i8 = this.f40747b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        obj2 = this.f40746a;
                        t.b(obj);
                        obj3 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    Object item = this.f40748c.getItem();
                    C4108g c4108g = this.f40749d;
                    String str = (String) this.f40748c.getItem();
                    this.f40746a = item;
                    this.f40747b = 1;
                    Object h8 = c4108g.h(str, this);
                    if (h8 == e8) {
                        return e8;
                    }
                    obj2 = item;
                    obj3 = h8;
                }
                if (s.g(obj3)) {
                    obj3 = null;
                }
                return new r(obj2, obj3);
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(List list, w wVar, Function0 function0, C4108g c4108g, Density density, int i8, S5.d dVar) {
            super(2, dVar);
            this.f40737c = list;
            this.f40738d = wVar;
            this.f40739e = function0;
            this.f40740f = c4108g;
            this.f40741g = density;
            this.f40742h = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            m mVar = new m(this.f40737c, this.f40738d, this.f40739e, this.f40740f, this.f40741g, this.f40742h, dVar);
            mVar.f40736b = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            U b8;
            r rVar;
            Object e8 = T5.b.e();
            int i8 = this.f40735a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    a8 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m8 = (M) this.f40736b;
                List list = this.f40737c;
                C4108g c4108g = this.f40740f;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b8 = AbstractC3364k.b(m8, null, null, new b((AnnotatedString.Range) it.next(), c4108g, null), 3, null);
                    arrayList.add(b8);
                }
                this.f40735a = 1;
                a8 = AbstractC3354f.a(arrayList, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (r rVar2 : (Iterable) a8) {
                Bitmap bitmap = (Bitmap) rVar2.d();
                if (bitmap != null) {
                    rVar = new r(rVar2.c(), bitmap);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList2.add(rVar);
                }
            }
            Map w8 = Q.w(arrayList2);
            w wVar = this.f40738d;
            Density density = this.f40741g;
            int i9 = this.f40742h;
            C4108g c4108g2 = this.f40740f;
            LinkedHashMap linkedHashMap = new LinkedHashMap(Q.d(w8.size()));
            for (Map.Entry entry : w8.entrySet()) {
                Object key = entry.getKey();
                long m2812times7Ah8Wj8 = Size.m2812times7Ah8Wj8(androidx.compose.ui.geometry.SizeKt.Size(((Bitmap) entry.getValue()).getWidth(), ((Bitmap) entry.getValue()).getHeight()), 1 / density.getDensity());
                linkedHashMap.put(key, new InlineTextContent(new Placeholder(TextUnitKt.getSp(Size.m2809getWidthimpl(m2812times7Ah8Wj8)), TextUnitKt.getSp(Size.m2806getHeightimpl(m2812times7Ah8Wj8)), i9, null), ComposableLambdaKt.composableLambdaInstance(858918421, true, new a(entry, c4108g2, m2812times7Ah8Wj8))));
            }
            wVar.setValue(linkedHashMap);
            this.f40739e.invoke();
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.text.AnnotatedString r53, long r54, androidx.compose.ui.text.TextStyle r56, androidx.compose.ui.Modifier r57, java.util.Map r58, boolean r59, int r60, int r61, kotlin.jvm.functions.Function1 r62, kotlin.jvm.functions.Function1 r63, androidx.compose.runtime.Composer r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.AbstractC4191c.a(androidx.compose.ui.text.AnnotatedString, long, androidx.compose.ui.text.TextStyle, androidx.compose.ui.Modifier, java.util.Map, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r43, androidx.compose.ui.Modifier r44, java.util.Map r45, long r46, androidx.compose.ui.text.TextStyle r48, boolean r49, androidx.compose.ui.text.SpanStyle r50, int r51, kotlin.jvm.functions.Function0 r52, androidx.compose.runtime.Composer r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.AbstractC4191c.b(java.lang.String, androidx.compose.ui.Modifier, java.util.Map, long, androidx.compose.ui.text.TextStyle, boolean, androidx.compose.ui.text.SpanStyle, int, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027b A[LOOP:1: B:82:0x0275->B:84:0x027b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r45, androidx.compose.ui.Modifier r46, java.util.Map r47, long r48, androidx.compose.ui.text.TextStyle r50, androidx.compose.ui.text.SpanStyle r51, int r52, kotlin.jvm.functions.Function1 r53, androidx.compose.runtime.Composer r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.AbstractC4191c.c(java.lang.String, androidx.compose.ui.Modifier, java.util.Map, long, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.SpanStyle, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AnnotatedString e(String text, Map map, SpanStyle spanStyle, Composer composer, int i8, int i9) {
        Map map2;
        SpanStyle spanStyle2;
        boolean z8;
        AbstractC3255y.i(text, "text");
        composer.startReplaceableGroup(1962487584);
        if ((i9 & 2) != 0) {
            map2 = Q.h();
        } else {
            map2 = map;
        }
        if ((i9 & 4) != 0) {
            spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC3247p) null);
        } else {
            spanStyle2 = spanStyle;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1962487584, i8, -1, "com.stripe.android.uicore.text.annotatedStringResource (Html.kt:351)");
        }
        composer.startReplaceableGroup(-1904947080);
        if ((((i8 & 14) ^ 6) > 4 && composer.changed(text)) || (i8 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = HtmlCompat.fromHtml(text, 0);
            composer.updateRememberedValue(rememberedValue);
        }
        Spanned spanned = (Spanned) rememberedValue;
        composer.endReplaceableGroup();
        AbstractC3255y.f(spanned);
        composer.startReplaceableGroup(-1904940542);
        boolean changed = composer.changed(spanned);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            AbstractC3255y.h(spans, "getSpans(...)");
            int i10 = 0;
            for (Object obj : spans) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (i10 < spanned.toString().length() && spanStart < spanned.toString().length() && spanStart - i10 >= 0) {
                    String substring = spanned.toString().substring(i10, spanStart);
                    AbstractC3255y.h(substring, "substring(...)");
                    builder.append(substring);
                    if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style != 1) {
                            if (style != 2) {
                                if (style == 3) {
                                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), FontStyle.m4804boximpl(FontStyle.Companion.m4813getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (AbstractC3247p) null), spanStart, spanEnd);
                                }
                            } else {
                                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m4804boximpl(FontStyle.Companion.m4813getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (AbstractC3247p) null), spanStart, spanEnd);
                            }
                        } else {
                            builder.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (AbstractC3247p) null), spanStart, spanEnd);
                        }
                    } else if (obj instanceof UnderlineSpan) {
                        builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC3247p) null), spanStart, spanEnd);
                    } else if (obj instanceof BulletSpan) {
                        builder.append("•\t");
                    } else if (obj instanceof ForegroundColorSpan) {
                        builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC3247p) null), spanStart, spanEnd);
                    } else if (obj instanceof ImageSpan) {
                        ImageSpan imageSpan = (ImageSpan) obj;
                        if (imageSpan.getSource() != null) {
                            if (!map2.isEmpty()) {
                                String source = imageSpan.getSource();
                                AbstractC3255y.f(source);
                                map2.containsKey(source);
                            }
                            String source2 = imageSpan.getSource();
                            AbstractC3255y.f(source2);
                            InlineTextContentKt.appendInlineContent$default(builder, source2, null, 2, null);
                        }
                        i10 = spanEnd;
                    } else if (obj instanceof URLSpan) {
                        builder.addStyle(spanStyle2, spanStart, spanEnd);
                        String url = ((URLSpan) obj).getURL();
                        AbstractC3255y.h(url, "getURL(...)");
                        builder.addStringAnnotation("URL", url, spanStart, spanEnd);
                    }
                    i10 = spanStart;
                }
            }
            if (i10 != spanned.toString().length()) {
                String substring2 = spanned.toString().substring(i10);
                AbstractC3255y.h(substring2, "substring(...)");
                builder.append(substring2);
            }
            rememberedValue2 = builder.toAnnotatedString();
            composer.updateRememberedValue(rememberedValue2);
        }
        AnnotatedString annotatedString = (AnnotatedString) rememberedValue2;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    private static final Map f(Map map, int i8, Composer composer, int i9) {
        composer.startReplaceableGroup(1925244042);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1925244042, i9, -1, "com.stripe.android.uicore.text.rememberBitmapImages (Html.kt:114)");
        }
        Set entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(g6.m.d(Q.d(AbstractC1378t.x(entrySet, 10)), 16));
        Iterator it = entrySet.iterator();
        if (!it.hasNext()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) it.next();
        android.support.v4.media.a.a(entry.getValue());
        throw null;
    }

    private static final Map g(Map map, int i8, Composer composer, int i9) {
        composer.startReplaceableGroup(389303035);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(389303035, i9, -1, "com.stripe.android.uicore.text.rememberDrawableImages (Html.kt:81)");
        }
        Set<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(g6.m.d(Q.d(AbstractC1378t.x(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            String str = (String) entry.getKey();
            AbstractC4190b.a aVar = (AbstractC4190b.a) entry.getValue();
            Painter painterResource = PainterResources_androidKt.painterResource(aVar.c(), composer, 0);
            float m2806getHeightimpl = Size.m2806getHeightimpl(painterResource.mo3513getIntrinsicSizeNHjbRc());
            float m2809getWidthimpl = Size.m2809getWidthimpl(painterResource.mo3513getIntrinsicSizeNHjbRc());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i10 = MaterialTheme.$stable;
            long m4728getFontSizeXSAIIZE = materialTheme.getTypography(composer, i10).getBody1().m4728getFontSizeXSAIIZE();
            TextUnitKt.m5383checkArithmeticR2X_6o(m4728getFontSizeXSAIIZE);
            r a8 = x.a(str, new InlineTextContent(new Placeholder(TextUnitKt.pack(TextUnit.m5368getRawTypeimpl(m4728getFontSizeXSAIIZE), TextUnit.m5370getValueimpl(m4728getFontSizeXSAIIZE) * (m2809getWidthimpl / m2806getHeightimpl)), materialTheme.getTypography(composer, i10).getBody1().m4728getFontSizeXSAIIZE(), i8, null), ComposableLambdaKt.composableLambda(composer, -737684954, true, new l(aVar, painterResource))));
            linkedHashMap.put(a8.c(), a8.d());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return linkedHashMap;
    }

    private static final State h(AnnotatedString annotatedString, Map map, C4108g c4108g, int i8, Function0 function0, Composer composer, int i9) {
        composer.startReplaceableGroup(-1863307166);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1863307166, i9, -1, "com.stripe.android.uicore.text.rememberRemoteImages (Html.kt:146)");
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(0, annotatedString.length());
        ArrayList arrayList = new ArrayList();
        for (Object obj : stringAnnotations) {
            String str = (String) ((AnnotatedString.Range) obj).getItem();
            if (AbstractC4111j.a(str) && !map.keySet().contains(str)) {
                arrayList.add(obj);
            }
        }
        composer.startReplaceableGroup(-1903942547);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AbstractC3700N.a(Q.h());
            composer.updateRememberedValue(rememberedValue);
        }
        w wVar = (w) rememberedValue;
        composer.endReplaceableGroup();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-1903937156);
        if (!arrayList.isEmpty()) {
            EffectsKt.LaunchedEffect(annotatedString, new m(arrayList, wVar, function0, c4108g, density, i8, null), composer, (i9 & 14) | 64);
        }
        composer.endReplaceableGroup();
        State a8 = y4.f.a(wVar, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a8;
    }
}
