package Q;

import android.content.Intent;

/* loaded from: classes3.dex */
final class C extends D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f8916a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P.e f8917b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(Intent intent, P.e eVar, int i8) {
        this.f8916a = intent;
        this.f8917b = eVar;
    }

    @Override // Q.D
    public final void a() {
        Intent intent = this.f8916a;
        if (intent != null) {
            this.f8917b.startActivityForResult(intent, 2);
        }
    }
}
