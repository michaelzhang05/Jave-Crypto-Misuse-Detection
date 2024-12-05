package e.g.a.c;

import android.view.View;
import rx.e;
import rx.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewLongClickOnSubscribe.java */
/* loaded from: classes2.dex */
public final class e implements e.a<Void> {

    /* renamed from: f, reason: collision with root package name */
    final View f17696f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.d<Boolean> f17697g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewLongClickOnSubscribe.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnLongClickListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f17698f;

        a(j jVar) {
            this.f17698f = jVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!e.this.f17697g.call().booleanValue()) {
                return false;
            }
            if (this.f17698f.isUnsubscribed()) {
                return true;
            }
            this.f17698f.onNext(null);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewLongClickOnSubscribe.java */
    /* loaded from: classes2.dex */
    public class b extends rx.l.a {
        b() {
        }

        @Override // rx.l.a
        protected void onUnsubscribe() {
            e.this.f17696f.setOnLongClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view, rx.m.d<Boolean> dVar) {
        this.f17696f = view;
        this.f17697g = dVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(j<? super Void> jVar) {
        rx.l.a.verifyMainThread();
        a aVar = new a(jVar);
        jVar.add(new b());
        this.f17696f.setOnLongClickListener(aVar);
    }
}
