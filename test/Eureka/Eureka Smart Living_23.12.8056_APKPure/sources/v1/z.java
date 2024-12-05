package v1;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
final class z extends b0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f9661a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f9662b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f9663c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Intent intent, Activity activity, int i6) {
        this.f9661a = intent;
        this.f9662b = activity;
        this.f9663c = i6;
    }

    @Override // v1.b0
    public final void a() {
        Intent intent = this.f9661a;
        if (intent != null) {
            this.f9662b.startActivityForResult(intent, this.f9663c);
        }
    }
}
