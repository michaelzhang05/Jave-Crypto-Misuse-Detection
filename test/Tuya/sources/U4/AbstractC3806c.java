package u4;

import L5.I;
import L5.r;
import L5.s;
import L5.t;
import L5.x;
import M5.AbstractC1246t;
import M5.Q;
import X5.n;
import X5.o;
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
import i6.AbstractC2819f;
import i6.AbstractC2829k;
import i6.M;
import i6.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.v;
import s4.AbstractC3754f;
import s4.AbstractC3758j;
import s4.C3755g;
import u4.AbstractC3805b;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3806c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38499a = new a();

        a() {
            super(1);
        }

        public final void invoke(TextLayoutResult it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextLayoutResult) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f38500a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f38501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState, Function1 function1) {
            super(1);
            this.f38500a = mutableState;
            this.f38501b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextLayoutResult) obj);
            return I.f6487a;
        }

        public final void invoke(TextLayoutResult it) {
            AbstractC3159y.i(it, "it");
            this.f38500a.setValue(it);
            this.f38501b.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0889c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f38502a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f38503b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f38504c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f38505d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f38506e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f38507f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38508g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38509h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f38510i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f38511j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f38512k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f38513l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0889c(AnnotatedString annotatedString, long j8, TextStyle textStyle, Modifier modifier, Map map, boolean z8, int i8, int i9, Function1 function1, Function1 function12, int i10, int i11) {
            super(2);
            this.f38502a = annotatedString;
            this.f38503b = j8;
            this.f38504c = textStyle;
            this.f38505d = modifier;
            this.f38506e = map;
            this.f38507f = z8;
            this.f38508g = i8;
            this.f38509h = i9;
            this.f38510i = function1;
            this.f38511j = function12;
            this.f38512k = i10;
            this.f38513l = i11;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3806c.a(this.f38502a, this.f38503b, this.f38504c, this.f38505d, this.f38506e, this.f38507f, this.f38508g, this.f38509h, this.f38510i, this.f38511j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38512k | 1), this.f38513l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f38514a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38515b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f38516c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f38517d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u4.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f38518a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f38519b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MutableState mutableState, Function1 function1) {
                super(1);
                this.f38518a = mutableState;
                this.f38519b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m5624invokek4lQ0M(((Offset) obj).m2745unboximpl());
                return I.f6487a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m5624invokek4lQ0M(long j8) {
                List<Rect> placeholderRects;
                List j02;
                Object obj;
                TextLayoutResult textLayoutResult = (TextLayoutResult) this.f38518a.getValue();
                if (textLayoutResult != null && (placeholderRects = textLayoutResult.getPlaceholderRects()) != null && (j02 = AbstractC1246t.j0(placeholderRects)) != null) {
                    Iterator it = j02.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Rect rect = (Rect) obj;
                            if (Offset.m2735getXimpl(j8) > Offset.m2735getXimpl(rect.m2770getTopLeftF1C5BW0()) && Offset.m2735getXimpl(j8) < Offset.m2735getXimpl(rect.m2771getTopRightF1C5BW0())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    Rect rect2 = (Rect) obj;
                    if (rect2 != null) {
                        j8 = Offset.m2729copydBAh8RU$default(rect2.m2771getTopRightF1C5BW0(), Offset.m2735getXimpl(rect2.m2771getTopRightF1C5BW0()) + 0.1f, 0.0f, 2, null);
                    }
                }
                if (((TextLayoutResult) this.f38518a.getValue()) != null) {
                    this.f38519b.invoke(Integer.valueOf(r0.m4664getOffsetForPositionk4lQ0M(j8) - 1));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MutableState mutableState, Function1 function1, P5.d dVar) {
            super(2, dVar);
            this.f38516c = mutableState;
            this.f38517d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(this.f38516c, this.f38517d, dVar);
            dVar2.f38515b = obj;
            return dVar2;
        }

        @Override // X5.n
        public final Object invoke(PointerInputScope pointerInputScope, P5.d dVar) {
            return ((d) create(pointerInputScope, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f38514a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f38515b;
                a aVar = new a(this.f38516c, this.f38517d);
                this.f38514a = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, aVar, this, 7, null) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f38520a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5625invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5625invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f38521a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f38522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f38523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z8, Function0 function0, Context context) {
            super(1);
            this.f38521a = z8;
            this.f38522b = function0;
            this.f38523c = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return I.f6487a;
        }

        public final void invoke(List annotatedStringRanges) {
            AbstractC3159y.i(annotatedStringRanges, "annotatedStringRanges");
            if (this.f38521a) {
                this.f38522b.invoke();
                AnnotatedString.Range range = (AnnotatedString.Range) AbstractC1246t.o0(annotatedStringRanges);
                if (range != null) {
                    Context context = this.f38523c;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse((String) range.getItem()));
                    context.startActivity(intent);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38524a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f38525b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f38526c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f38527d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f38528e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f38529f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ SpanStyle f38530g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38531h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f38532i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f38533j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f38534k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Modifier modifier, Map map, long j8, TextStyle textStyle, boolean z8, SpanStyle spanStyle, int i8, Function0 function0, int i9, int i10) {
            super(2);
            this.f38524a = str;
            this.f38525b = modifier;
            this.f38526c = map;
            this.f38527d = j8;
            this.f38528e = textStyle;
            this.f38529f = z8;
            this.f38530g = spanStyle;
            this.f38531h = i8;
            this.f38532i = function0;
            this.f38533j = i9;
            this.f38534k = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3806c.b(this.f38524a, this.f38525b, this.f38526c, this.f38527d, this.f38528e, this.f38529f, this.f38530g, this.f38531h, this.f38532i, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38533j | 1), this.f38534k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f38535a = new h();

        h() {
            super(1);
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f38536a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f38537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1, AnnotatedString annotatedString) {
            super(1);
            this.f38536a = function1;
            this.f38537b = annotatedString;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return I.f6487a;
        }

        public final void invoke(int i8) {
            this.f38536a.invoke(this.f38537b.getStringAnnotations("URL", i8, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38538a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f38539b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f38540c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f38541d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f38542e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SpanStyle f38543f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38544g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f38545h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38546i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f38547j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Modifier modifier, Map map, long j8, TextStyle textStyle, SpanStyle spanStyle, int i8, Function1 function1, int i9, int i10) {
            super(2);
            this.f38538a = str;
            this.f38539b = modifier;
            this.f38540c = map;
            this.f38541d = j8;
            this.f38542e = textStyle;
            this.f38543f = spanStyle;
            this.f38544g = i8;
            this.f38545h = function1;
            this.f38546i = i9;
            this.f38547j = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3806c.c(this.f38538a, this.f38539b, this.f38540c, this.f38541d, this.f38542e, this.f38543f, this.f38544g, this.f38545h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38546i | 1), this.f38547j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f38548a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(MutableState mutableState) {
            super(0);
            this.f38548a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5626invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5626invoke() {
            this.f38548a.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3805b.a f38549a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Painter f38550b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(AbstractC3805b.a aVar, Painter painter) {
            super(3);
            this.f38549a = aVar;
            this.f38550b = painter;
        }

        public final void a(String it, Composer composer, int i8) {
            AbstractC3159y.i(it, "it");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-737684954, i8, -1, "com.stripe.android.uicore.text.rememberDrawableImages.<anonymous>.<anonymous> (Html.kt:95)");
            }
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 1, null);
            ImageKt.Image(this.f38550b, StringResources_androidKt.stringResource(this.f38549a.b(), composer, 0), fillMaxHeight$default, (Alignment) null, (ContentScale) null, 0.0f, this.f38549a.a(), composer, 392, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((String) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.c$m */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f38551a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38552b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f38553c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f38554d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f38555e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3755g f38556f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Density f38557g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38558h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u4.c$m$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Map.Entry f38559a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3755g f38560b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f38561c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Map.Entry entry, C3755g c3755g, long j8) {
                super(3);
                this.f38559a = entry;
                this.f38560b = c3755g;
                this.f38561c = j8;
            }

            public final void a(String it, Composer composer, int i8) {
                AbstractC3159y.i(it, "it");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(858918421, i8, -1, "com.stripe.android.uicore.text.rememberRemoteImages.<anonymous>.<anonymous>.<anonymous> (Html.kt:186)");
                }
                AbstractC3754f.a((String) this.f38559a.getKey(), this.f38560b, null, SizeKt.m633height3ABfNKs(SizeKt.m652width3ABfNKs(Modifier.Companion, Dp.m5178constructorimpl(Size.m2804getWidthimpl(this.f38561c))), Dp.m5178constructorimpl(Size.m2801getHeightimpl(this.f38561c))), null, null, null, null, false, null, null, composer, 448, 0, 2032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // X5.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((String) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u4.c$m$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            Object f38562a;

            /* renamed from: b, reason: collision with root package name */
            int f38563b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AnnotatedString.Range f38564c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3755g f38565d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AnnotatedString.Range range, C3755g c3755g, P5.d dVar) {
                super(2, dVar);
                this.f38564c = range;
                this.f38565d = c3755g;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f38564c, this.f38565d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object obj3;
                Object e8 = Q5.b.e();
                int i8 = this.f38563b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        obj2 = this.f38562a;
                        t.b(obj);
                        obj3 = ((s) obj).k();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    Object item = this.f38564c.getItem();
                    C3755g c3755g = this.f38565d;
                    String str = (String) this.f38564c.getItem();
                    this.f38562a = item;
                    this.f38563b = 1;
                    Object h8 = c3755g.h(str, this);
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(List list, v vVar, Function0 function0, C3755g c3755g, Density density, int i8, P5.d dVar) {
            super(2, dVar);
            this.f38553c = list;
            this.f38554d = vVar;
            this.f38555e = function0;
            this.f38556f = c3755g;
            this.f38557g = density;
            this.f38558h = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            m mVar = new m(this.f38553c, this.f38554d, this.f38555e, this.f38556f, this.f38557g, this.f38558h, dVar);
            mVar.f38552b = obj;
            return mVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            U b8;
            r rVar;
            Object e8 = Q5.b.e();
            int i8 = this.f38551a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    a8 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m8 = (M) this.f38552b;
                List list = this.f38553c;
                C3755g c3755g = this.f38556f;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b8 = AbstractC2829k.b(m8, null, null, new b((AnnotatedString.Range) it.next(), c3755g, null), 3, null);
                    arrayList.add(b8);
                }
                this.f38551a = 1;
                a8 = AbstractC2819f.a(arrayList, this);
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
            v vVar = this.f38554d;
            Density density = this.f38557g;
            int i9 = this.f38558h;
            C3755g c3755g2 = this.f38556f;
            LinkedHashMap linkedHashMap = new LinkedHashMap(Q.d(w8.size()));
            for (Map.Entry entry : w8.entrySet()) {
                Object key = entry.getKey();
                long m2807times7Ah8Wj8 = Size.m2807times7Ah8Wj8(androidx.compose.ui.geometry.SizeKt.Size(((Bitmap) entry.getValue()).getWidth(), ((Bitmap) entry.getValue()).getHeight()), 1 / density.getDensity());
                linkedHashMap.put(key, new InlineTextContent(new Placeholder(TextUnitKt.getSp(Size.m2804getWidthimpl(m2807times7Ah8Wj8)), TextUnitKt.getSp(Size.m2801getHeightimpl(m2807times7Ah8Wj8)), i9, null), ComposableLambdaKt.composableLambdaInstance(858918421, true, new a(entry, c3755g2, m2807times7Ah8Wj8))));
            }
            vVar.setValue(linkedHashMap);
            this.f38555e.invoke();
            return I.f6487a;
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
        throw new UnsupportedOperationException("Method not decompiled: u4.AbstractC3806c.a(androidx.compose.ui.text.AnnotatedString, long, androidx.compose.ui.text.TextStyle, androidx.compose.ui.Modifier, java.util.Map, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: u4.AbstractC3806c.b(java.lang.String, androidx.compose.ui.Modifier, java.util.Map, long, androidx.compose.ui.text.TextStyle, boolean, androidx.compose.ui.text.SpanStyle, int, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: u4.AbstractC3806c.c(java.lang.String, androidx.compose.ui.Modifier, java.util.Map, long, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.SpanStyle, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AnnotatedString e(String text, Map map, SpanStyle spanStyle, Composer composer, int i8, int i9) {
        Map map2;
        SpanStyle spanStyle2;
        boolean z8;
        AbstractC3159y.i(text, "text");
        composer.startReplaceableGroup(1962487584);
        if ((i9 & 2) != 0) {
            map2 = Q.h();
        } else {
            map2 = map;
        }
        if ((i9 & 4) != 0) {
            spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC3151p) null);
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
        AbstractC3159y.f(spanned);
        composer.startReplaceableGroup(-1904940542);
        boolean changed = composer.changed(spanned);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            AbstractC3159y.h(spans, "getSpans(...)");
            int i10 = 0;
            for (Object obj : spans) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (i10 < spanned.toString().length() && spanStart < spanned.toString().length() && spanStart - i10 >= 0) {
                    String substring = spanned.toString().substring(i10, spanStart);
                    AbstractC3159y.h(substring, "substring(...)");
                    builder.append(substring);
                    if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style != 1) {
                            if (style != 2) {
                                if (style == 3) {
                                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), FontStyle.m4799boximpl(FontStyle.Companion.m4808getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (AbstractC3151p) null), spanStart, spanEnd);
                                }
                            } else {
                                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m4799boximpl(FontStyle.Companion.m4808getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (AbstractC3151p) null), spanStart, spanEnd);
                            }
                        } else {
                            builder.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (AbstractC3151p) null), spanStart, spanEnd);
                        }
                    } else if (obj instanceof UnderlineSpan) {
                        builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC3151p) null), spanStart, spanEnd);
                    } else if (obj instanceof BulletSpan) {
                        builder.append("•\t");
                    } else if (obj instanceof ForegroundColorSpan) {
                        builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC3151p) null), spanStart, spanEnd);
                    } else if (obj instanceof ImageSpan) {
                        ImageSpan imageSpan = (ImageSpan) obj;
                        if (imageSpan.getSource() != null) {
                            if (!map2.isEmpty()) {
                                String source = imageSpan.getSource();
                                AbstractC3159y.f(source);
                                map2.containsKey(source);
                            }
                            String source2 = imageSpan.getSource();
                            AbstractC3159y.f(source2);
                            InlineTextContentKt.appendInlineContent$default(builder, source2, null, 2, null);
                        }
                        i10 = spanEnd;
                    } else if (obj instanceof URLSpan) {
                        builder.addStyle(spanStyle2, spanStart, spanEnd);
                        String url = ((URLSpan) obj).getURL();
                        AbstractC3159y.h(url, "getURL(...)");
                        builder.addStringAnnotation("URL", url, spanStart, spanEnd);
                    }
                    i10 = spanStart;
                }
            }
            if (i10 != spanned.toString().length()) {
                String substring2 = spanned.toString().substring(i10);
                AbstractC3159y.h(substring2, "substring(...)");
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
        LinkedHashMap linkedHashMap = new LinkedHashMap(d6.m.d(Q.d(AbstractC1246t.x(entrySet, 10)), 16));
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
        LinkedHashMap linkedHashMap = new LinkedHashMap(d6.m.d(Q.d(AbstractC1246t.x(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            String str = (String) entry.getKey();
            AbstractC3805b.a aVar = (AbstractC3805b.a) entry.getValue();
            Painter painterResource = PainterResources_androidKt.painterResource(aVar.c(), composer, 0);
            float m2801getHeightimpl = Size.m2801getHeightimpl(painterResource.mo3508getIntrinsicSizeNHjbRc());
            float m2804getWidthimpl = Size.m2804getWidthimpl(painterResource.mo3508getIntrinsicSizeNHjbRc());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i10 = MaterialTheme.$stable;
            long m4723getFontSizeXSAIIZE = materialTheme.getTypography(composer, i10).getBody1().m4723getFontSizeXSAIIZE();
            TextUnitKt.m5378checkArithmeticR2X_6o(m4723getFontSizeXSAIIZE);
            r a8 = x.a(str, new InlineTextContent(new Placeholder(TextUnitKt.pack(TextUnit.m5363getRawTypeimpl(m4723getFontSizeXSAIIZE), TextUnit.m5365getValueimpl(m4723getFontSizeXSAIIZE) * (m2804getWidthimpl / m2801getHeightimpl)), materialTheme.getTypography(composer, i10).getBody1().m4723getFontSizeXSAIIZE(), i8, null), ComposableLambdaKt.composableLambda(composer, -737684954, true, new l(aVar, painterResource))));
            linkedHashMap.put(a8.c(), a8.d());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return linkedHashMap;
    }

    private static final State h(AnnotatedString annotatedString, Map map, C3755g c3755g, int i8, Function0 function0, Composer composer, int i9) {
        composer.startReplaceableGroup(-1863307166);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1863307166, i9, -1, "com.stripe.android.uicore.text.rememberRemoteImages (Html.kt:146)");
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(0, annotatedString.length());
        ArrayList arrayList = new ArrayList();
        for (Object obj : stringAnnotations) {
            String str = (String) ((AnnotatedString.Range) obj).getItem();
            if (AbstractC3758j.a(str) && !map.keySet().contains(str)) {
                arrayList.add(obj);
            }
        }
        composer.startReplaceableGroup(-1903942547);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AbstractC3351M.a(Q.h());
            composer.updateRememberedValue(rememberedValue);
        }
        v vVar = (v) rememberedValue;
        composer.endReplaceableGroup();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-1903937156);
        if (!arrayList.isEmpty()) {
            EffectsKt.LaunchedEffect(annotatedString, new m(arrayList, vVar, function0, c3755g, density, i8, null), composer, (i9 & 14) | 64);
        }
        composer.endReplaceableGroup();
        State a8 = v4.f.a(vVar, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a8;
    }
}
