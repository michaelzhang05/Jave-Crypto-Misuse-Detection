package Q;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes3.dex */
final class B extends D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f8913a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f8914b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f8915c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(Intent intent, Activity activity, int i8) {
        this.f8913a = intent;
        this.f8914b = activity;
        this.f8915c = i8;
    }

    @Override // Q.D
    public final void a() {
        Intent intent = this.f8913a;
        if (intent != null) {
            this.f8914b.startActivityForResult(intent, this.f8915c);
        }
    }
}
