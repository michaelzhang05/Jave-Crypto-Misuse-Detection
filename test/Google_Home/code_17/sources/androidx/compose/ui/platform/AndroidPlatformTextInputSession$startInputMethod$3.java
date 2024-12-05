package androidx.compose.ui.platform;

import O5.C1352h;
import a6.InterfaceC1668n;
import androidx.compose.ui.text.input.TextInputService;
import l6.C3374p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$3 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(AndroidPlatformTextInputSession androidPlatformTextInputSession, S5.d dVar) {
        super(2, dVar);
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, dVar);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(InputMethodSession inputMethodSession, S5.d dVar) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create(inputMethodSession, dVar)).invokeSuspend(O5.I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TextInputService textInputService;
        Object e8 = T5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O5.t.b(obj);
        } else {
            O5.t.b(obj);
            InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
            AndroidPlatformTextInputSession androidPlatformTextInputSession = this.this$0;
            this.L$0 = inputMethodSession;
            this.L$1 = androidPlatformTextInputSession;
            this.label = 1;
            C3374p c3374p = new C3374p(T5.b.c(this), 1);
            c3374p.C();
            textInputService = androidPlatformTextInputSession.textInputService;
            textInputService.startInput();
            c3374p.i(new AndroidPlatformTextInputSession$startInputMethod$3$1$1(inputMethodSession, androidPlatformTextInputSession));
            Object y8 = c3374p.y();
            if (y8 == T5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(this);
            }
            if (y8 == e8) {
                return e8;
            }
        }
        throw new C1352h();
    }
}
