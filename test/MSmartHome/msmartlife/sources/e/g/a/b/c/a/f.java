package e.g.a.b.c.a;

import androidx.appcompat.widget.SearchView;
import rx.e;
import rx.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewQueryTextChangeEventsOnSubscribe.java */
/* loaded from: classes2.dex */
public final class f implements e.a<g> {

    /* renamed from: f, reason: collision with root package name */
    final SearchView f17680f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchViewQueryTextChangeEventsOnSubscribe.java */
    /* loaded from: classes2.dex */
    public class a implements SearchView.l {
        final /* synthetic */ j a;

        a(j jVar) {
            this.a = jVar;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean a(String str) {
            if (this.a.isUnsubscribed()) {
                return false;
            }
            this.a.onNext(g.b(f.this.f17680f, str, false));
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean b(String str) {
            if (this.a.isUnsubscribed()) {
                return false;
            }
            j jVar = this.a;
            SearchView searchView = f.this.f17680f;
            jVar.onNext(g.b(searchView, searchView.getQuery(), true));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchViewQueryTextChangeEventsOnSubscribe.java */
    /* loaded from: classes2.dex */
    public class b extends rx.l.a {
        b() {
        }

        @Override // rx.l.a
        protected void onUnsubscribe() {
            f.this.f17680f.setOnQueryTextListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(SearchView searchView) {
        this.f17680f = searchView;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(j<? super g> jVar) {
        rx.l.a.verifyMainThread();
        a aVar = new a(jVar);
        jVar.add(new b());
        this.f17680f.setOnQueryTextListener(aVar);
        SearchView searchView = this.f17680f;
        jVar.onNext(g.b(searchView, searchView.getQuery(), false));
    }
}
