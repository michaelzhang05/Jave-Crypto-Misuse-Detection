package androidx.compose.ui.platform;

import L5.C1224h;
import androidx.compose.ui.text.input.TextInputService;
import i6.C2839p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$3 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(AndroidPlatformTextInputSession androidPlatformTextInputSession, P5.d dVar) {
        super(2, dVar);
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, dVar);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // X5.n
    public final Object invoke(InputMethodSession inputMethodSession, P5.d dVar) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create(inputMethodSession, dVar)).invokeSuspend(L5.I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TextInputService textInputService;
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            L5.t.b(obj);
        } else {
            L5.t.b(obj);
            InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
            AndroidPlatformTextInputSession androidPlatformTextInputSession = this.this$0;
            this.L$0 = inputMethodSession;
            this.L$1 = androidPlatformTextInputSession;
            this.label = 1;
            C2839p c2839p = new C2839p(Q5.b.c(this), 1);
            c2839p.B();
            textInputService = androidPlatformTextInputSession.textInputService;
            textInputService.startInput();
            c2839p.j(new AndroidPlatformTextInputSession$startInputMethod$3$1$1(inputMethodSession, androidPlatformTextInputSession));
            Object y8 = c2839p.y();
            if (y8 == Q5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(this);
            }
            if (y8 == e8) {
                return e8;
            }
        }
        throw new C1224h();
    }
}
