package cm.aptoide.pt.search.view;

import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.logger.Logger;
import cm.aptoide.pt.presenter.Presenter;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.search.SearchNavigator;
import cm.aptoide.pt.search.SuggestionCursorAdapter;
import cm.aptoide.pt.search.analytics.SearchAnalytics;
import cm.aptoide.pt.search.model.SearchQueryModel;
import cm.aptoide.pt.search.suggestions.SearchQueryEvent;
import cm.aptoide.pt.search.suggestions.SearchSuggestionManager;
import cm.aptoide.pt.search.suggestions.TrendingManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.Single;

/* loaded from: classes.dex */
public class SearchSuggestionsPresenter implements Presenter {
    private static final String TAG = "cm.aptoide.pt.search.view.SearchSuggestionsPresenter";
    private final CrashReport crashReport;
    private final SearchNavigator navigator;
    private final SearchAnalytics searchAnalytics;
    private final SearchSuggestionManager searchSuggestionManager;
    private boolean showSuggestionsOnFirstLoadWithEmptyQuery;
    private final SuggestionCursorAdapter suggestionCursorAdapter;
    private final TrendingManager trendingManager;
    private final SearchSuggestionsView view;
    private final rx.h viewScheduler;

    public SearchSuggestionsPresenter(SearchSuggestionsView searchSuggestionsView, SearchSuggestionManager searchSuggestionManager, rx.h hVar, SuggestionCursorAdapter suggestionCursorAdapter, CrashReport crashReport, TrendingManager trendingManager, SearchNavigator searchNavigator, boolean z, SearchAnalytics searchAnalytics) {
        this.view = searchSuggestionsView;
        this.searchSuggestionManager = searchSuggestionManager;
        this.viewScheduler = hVar;
        this.suggestionCursorAdapter = suggestionCursorAdapter;
        this.crashReport = crashReport;
        this.trendingManager = trendingManager;
        this.navigator = searchNavigator;
        this.showSuggestionsOnFirstLoadWithEmptyQuery = z;
        this.searchAnalytics = searchAnalytics;
    }

    private rx.e<SearchQueryEvent> getDebouncedQueryChanges() {
        return this.view.onQueryTextChanged().m(250L, TimeUnit.MILLISECONDS);
    }

    private void handleQueryTextChanged() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.search.view.z6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.search.view.q7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return SearchSuggestionsPresenter.this.d((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.search.view.w6
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.lambda$handleQueryTextChanged$20((List) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.search.view.e7
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.this.e((Throwable) obj);
            }
        });
    }

    private void handleQueryTextCleaned() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.search.view.t6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.search.view.k7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return SearchSuggestionsPresenter.this.f((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.search.view.i7
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.lambda$handleQueryTextCleaned$11((List) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.search.view.y6
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.this.g((Throwable) obj);
            }
        });
    }

    private void handleQueryTextSubmitted() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.search.view.f7
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.search.view.o6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return SearchSuggestionsPresenter.this.j((View.LifecycleEvent) obj);
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.search.view.o7
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.this.k((SearchQueryEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.search.view.n6
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.lambda$handleQueryTextSubmitted$4((SearchQueryEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.search.view.c7
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.this.l((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single a(Throwable th) {
        if (th instanceof TimeoutException) {
            Logger.getInstance().i(TAG, "Timeout reached while waiting for application suggestions");
            return Single.m(this.suggestionCursorAdapter.getSuggestions());
        }
        return Single.h(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b(List list) {
        this.suggestionCursorAdapter.setData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single c(String str) {
        return this.searchSuggestionManager.getSuggestionsForApp(str).q(new rx.m.e() { // from class: cm.aptoide.pt.search.view.x6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return SearchSuggestionsPresenter.this.a((Throwable) obj);
            }
        }).p(this.viewScheduler).g(new rx.m.b() { // from class: cm.aptoide.pt.search.view.r6
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.this.b((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e d(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().D(new rx.m.e() { // from class: cm.aptoide.pt.search.view.l7
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.hasQuery() && !r1.isSubmitted());
                return valueOf;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.search.view.g7
            @Override // rx.m.e
            public final Object call(Object obj) {
                String str;
                str = ((SearchQueryEvent) obj).getQuery().toString();
                return str;
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.search.view.v6
            @Override // rx.m.e
            public final Object call(Object obj) {
                return SearchSuggestionsPresenter.this.c((String) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleQueryTextChanged$20(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e f(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().D(new rx.m.e() { // from class: cm.aptoide.pt.search.view.j7
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                SearchQueryEvent searchQueryEvent = (SearchQueryEvent) obj;
                valueOf = Boolean.valueOf(!searchQueryEvent.hasQuery());
                return valueOf;
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.search.view.h7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return SearchSuggestionsPresenter.this.i((SearchQueryEvent) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleQueryTextCleaned$11(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h(List list) {
        this.view.setTrendingCursor(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single i(SearchQueryEvent searchQueryEvent) {
        return this.trendingManager.getTrendingCursorSuggestions().p(this.viewScheduler).g(new rx.m.b() { // from class: cm.aptoide.pt.search.view.m7
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.this.h((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextSubmitted$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e j(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().D(new rx.m.e() { // from class: cm.aptoide.pt.search.view.p6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.hasQuery() && r1.isSubmitted());
                return valueOf;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextSubmitted$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void k(SearchQueryEvent searchQueryEvent) {
        this.view.collapseSearchBar(true);
        SearchQueryModel searchQueryModel = new SearchQueryModel(searchQueryEvent.getQuery());
        this.navigator.navigate(searchQueryModel);
        if (searchQueryEvent.isSuggestion()) {
            this.searchAnalytics.searchFromSuggestion(searchQueryModel, searchQueryEvent.getPosition());
        } else {
            this.searchAnalytics.search(searchQueryModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleQueryTextSubmitted$4(SearchQueryEvent searchQueryEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextSubmitted$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m(View.LifecycleEvent lifecycleEvent) {
        return this.view.onQueryTextChanged().E().Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean n(SearchQueryEvent searchQueryEvent) {
        String currentQuery = this.view.getCurrentQuery();
        return Boolean.valueOf((searchQueryEvent == null || searchQueryEvent.getQuery().length() == 0) && (currentQuery == null || currentQuery.isEmpty()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single o(SearchQueryEvent searchQueryEvent) {
        return this.trendingManager.getTrendingCursorSuggestions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void p(List list) {
        this.view.setTrendingCursor(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void q(List list) {
        this.view.focusInSearchBar();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$showSuggestionsIfCurrentQueryIsEmpty$29(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void r(Throwable th) {
        this.crashReport.log(th);
    }

    private void showSuggestionsIfCurrentQueryIsEmpty() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.search.view.p7
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.search.view.a7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return SearchSuggestionsPresenter.this.m((View.LifecycleEvent) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.search.view.r7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return SearchSuggestionsPresenter.this.n((SearchQueryEvent) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.search.view.d7
            @Override // rx.m.e
            public final Object call(Object obj) {
                return SearchSuggestionsPresenter.this.o((SearchQueryEvent) obj);
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.search.view.s6
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0 != null && r0.size() > 0);
                return valueOf;
            }
        }).j0(this.viewScheduler).x(new rx.m.b() { // from class: cm.aptoide.pt.search.view.q6
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.this.p((List) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.search.view.n7
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.this.q((List) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.search.view.u6
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.lambda$showSuggestionsIfCurrentQueryIsEmpty$29((List) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.search.view.b7
            @Override // rx.m.b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.this.r((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        handleQueryTextSubmitted();
        handleQueryTextCleaned();
        handleQueryTextChanged();
        if (this.showSuggestionsOnFirstLoadWithEmptyQuery) {
            showSuggestionsIfCurrentQueryIsEmpty();
        }
    }
}
