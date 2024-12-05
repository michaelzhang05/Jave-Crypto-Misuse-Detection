package e.g.a.b.b.a;

import androidx.core.widget.NestedScrollView;
import e.g.a.c.f;
import rx.e;
import rx.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NestedScrollViewScrollChangeEventOnSubscribe.java */
/* loaded from: classes2.dex */
public final class a implements e.a<f> {

    /* renamed from: f, reason: collision with root package name */
    final NestedScrollView f17668f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollViewScrollChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.b.b.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0226a implements NestedScrollView.b {
        final /* synthetic */ j a;

        C0226a(j jVar) {
            this.a = jVar;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            if (this.a.isUnsubscribed()) {
                return;
            }
            this.a.onNext(f.b(a.this.f17668f, i2, i3, i4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollViewScrollChangeEventOnSubscribe.java */
    /* loaded from: classes2.dex */
    public class b extends rx.l.a {
        b() {
        }

        @Override // rx.l.a
        protected void onUnsubscribe() {
            a.this.f17668f.setOnScrollChangeListener((NestedScrollView.b) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(NestedScrollView nestedScrollView) {
        this.f17668f = nestedScrollView;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(j<? super f> jVar) {
        rx.l.a.verifyMainThread();
        C0226a c0226a = new C0226a(jVar);
        jVar.add(new b());
        this.f17668f.setOnScrollChangeListener(c0226a);
    }
}
