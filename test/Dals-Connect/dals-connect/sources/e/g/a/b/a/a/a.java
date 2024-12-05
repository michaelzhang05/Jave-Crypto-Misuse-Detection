package e.g.a.b.a.a;

import com.google.android.material.appbar.AppBarLayout;
import rx.e;
import rx.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBarLayoutOffsetChangeOnSubscribe.java */
/* loaded from: classes2.dex */
public final class a implements e.a<Integer> {

    /* renamed from: f, reason: collision with root package name */
    final AppBarLayout f17661f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppBarLayoutOffsetChangeOnSubscribe.java */
    /* renamed from: e.g.a.b.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0225a implements AppBarLayout.e {
        final /* synthetic */ j a;

        C0225a(j jVar) {
            this.a = jVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
            if (this.a.isUnsubscribed()) {
                return;
            }
            this.a.onNext(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppBarLayoutOffsetChangeOnSubscribe.java */
    /* loaded from: classes2.dex */
    public class b extends rx.l.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AppBarLayout.e f17663f;

        b(AppBarLayout.e eVar) {
            this.f17663f = eVar;
        }

        @Override // rx.l.a
        protected void onUnsubscribe() {
            a.this.f17661f.p(this.f17663f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AppBarLayout appBarLayout) {
        this.f17661f = appBarLayout;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(j<? super Integer> jVar) {
        rx.l.a.verifyMainThread();
        C0225a c0225a = new C0225a(jVar);
        jVar.add(new b(c0225a));
        this.f17661f.b(c0225a);
    }
}
