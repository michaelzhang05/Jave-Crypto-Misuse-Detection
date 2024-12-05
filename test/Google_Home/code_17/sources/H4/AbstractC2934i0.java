package h4;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: h4.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2934i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f32623a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.i0$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f32624a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f32625b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f32626c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f32627d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ UriHandler f32628e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h4.i0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0761a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f32629a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AnnotatedString f32630b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ UriHandler f32631c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0761a(MutableState mutableState, AnnotatedString annotatedString, UriHandler uriHandler) {
                super(1);
                this.f32629a = mutableState;
                this.f32630b = annotatedString;
                this.f32631c = uriHandler;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m5588invokek4lQ0M(((Offset) obj).m2750unboximpl());
                return O5.I.f8278a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m5588invokek4lQ0M(long j8) {
                TextLayoutResult textLayoutResult = (TextLayoutResult) this.f32629a.getValue();
                if (textLayoutResult != null) {
                    AnnotatedString annotatedString = this.f32630b;
                    UriHandler uriHandler = this.f32631c;
                    int m4669getOffsetForPositionk4lQ0M = textLayoutResult.m4669getOffsetForPositionk4lQ0M(j8);
                    AnnotatedString.Range range = (AnnotatedString.Range) AbstractC1378t.o0(annotatedString.getStringAnnotations(m4669getOffsetForPositionk4lQ0M, m4669getOffsetForPositionk4lQ0M));
                    if (range != null && AbstractC3255y.d(range.getTag(), "URL")) {
                        uriHandler.openUri((String) range.getItem());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MutableState mutableState, AnnotatedString annotatedString, UriHandler uriHandler, S5.d dVar) {
            super(2, dVar);
            this.f32626c = mutableState;
            this.f32627d = annotatedString;
            this.f32628e = uriHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(this.f32626c, this.f32627d, this.f32628e, dVar);
            aVar.f32625b = obj;
            return aVar;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(PointerInputScope pointerInputScope, S5.d dVar) {
            return ((a) create(pointerInputScope, dVar)).invokeSuspend(O5.I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f32624a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f32625b;
                C0761a c0761a = new C0761a(this.f32626c, this.f32627d, this.f32628e);
                this.f32624a = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, c0761a, this, 7, null) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.i0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f32632a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState) {
            super(1);
            this.f32632a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextLayoutResult) obj);
            return O5.I.f8278a;
        }

        public final void invoke(TextLayoutResult it) {
            AbstractC3255y.i(it, "it");
            this.f32632a.setValue(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.i0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f32634b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f32635c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextStyle f32636d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f32637e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f32638f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Modifier modifier, long j8, TextStyle textStyle, int i8, int i9) {
            super(2);
            this.f32633a = str;
            this.f32634b = modifier;
            this.f32635c = j8;
            this.f32636d = textStyle;
            this.f32637e = i8;
            this.f32638f = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2934i0.a(this.f32633a, this.f32634b, this.f32635c, this.f32636d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32637e | 1), this.f32638f);
        }
    }

    static {
        Pattern compile = Pattern.compile("(https?://[a-z0-9.-]+\\.[a-z]{2,3}(?:/\\S*?(?=\\.*(?:\\s|$)))?)", 42);
        AbstractC3255y.h(compile, "compile(...)");
        f32623a = compile;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144 A[LOOP:0: B:61:0x013e->B:63:0x0144, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r36, androidx.compose.ui.Modifier r37, long r38, androidx.compose.ui.text.TextStyle r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.AbstractC2934i0.a(java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final List b(String str) {
        Matcher matcher = f32623a.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int start = matcher.start(1);
            int end = matcher.end();
            String substring = str.substring(start, end);
            AbstractC3255y.h(substring, "substring(...)");
            if (!j6.n.C(substring, "http://", false, 2, null) && !j6.n.C(substring, "https://", false, 2, null)) {
                substring = "https://" + substring;
            }
            arrayList.add(new C2951r0(substring, start, end));
        }
        return arrayList;
    }
}
