package v1;

import android.content.Intent;

/* loaded from: classes.dex */
final class a0 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f9499a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u1.e f9500b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Intent intent, u1.e eVar, int i6) {
        this.f9499a = intent;
        this.f9500b = eVar;
    }

    @Override // v1.b0
    public final void a() {
        Intent intent = this.f9499a;
        if (intent != null) {
            this.f9500b.startActivityForResult(intent, 2);
        }
    }
}
