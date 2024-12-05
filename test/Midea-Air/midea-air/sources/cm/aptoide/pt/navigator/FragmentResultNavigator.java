package cm.aptoide.pt.navigator;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.fragment.app.m;
import java.util.Map;

/* loaded from: classes.dex */
public class FragmentResultNavigator implements FragmentNavigator {
    private final int containerId;
    private final int enterAnimation;
    private final int exitAnimation;
    private final h fragmentManager;
    private final e.g.b.a<Map<Integer, Result>> resultRelay;
    private final Map<Integer, Result> results;

    public FragmentResultNavigator(h hVar, int i2, int i3, int i4, Map<Integer, Result> map, e.g.b.a<Map<Integer, Result>> aVar) {
        this.fragmentManager = hVar;
        this.containerId = i2;
        this.enterAnimation = i3;
        this.exitAnimation = i4;
        this.results = map;
        this.resultRelay = aVar;
    }

    private void handleNavigationResult(Result result) {
        this.results.put(Integer.valueOf(result.getRequestCode()), result);
        this.resultRelay.call(this.results);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Result lambda$results$1(int i2, Map map) {
        return (Result) map.get(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$results$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a(int i2, Result result) {
        this.results.remove(Integer.valueOf(i2));
    }

    private void setUpNavigationForResult(Fragment fragment, int i2) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt(FragmentNavigator.REQUEST_CODE_EXTRA, i2);
        fragment.setArguments(arguments);
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public void cleanBackStack() {
        for (int i2 = 0; i2 < this.fragmentManager.g(); i2++) {
            this.fragmentManager.k();
        }
        this.fragmentManager.c();
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public int getBackStackEntryCount() {
        return this.fragmentManager.g();
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public Fragment getFragment() {
        return this.fragmentManager.d(this.containerId);
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public String getTagByBackStackEntry(int i2) {
        return this.fragmentManager.f(i2).getName();
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public void navigateForResult(Fragment fragment, int i2, boolean z) {
        setUpNavigationForResult(fragment, i2);
        navigateTo(fragment, z);
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public String navigateTo(Fragment fragment, boolean z) {
        m c2;
        String num = Integer.toString(this.fragmentManager.g());
        m a = this.fragmentManager.a();
        int i2 = this.enterAnimation;
        int i3 = this.exitAnimation;
        m f2 = a.r(i2, i3, i2, i3).f(num);
        if (z) {
            c2 = f2.q(this.containerId, fragment, num);
        } else {
            c2 = f2.c(this.containerId, fragment, num);
        }
        c2.h();
        return num;
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public void navigateToCleaningBackStack(Fragment fragment, boolean z) {
        cleanBackStack();
        navigateToWithoutBackSave(fragment, z);
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public void navigateToDialogForResult(androidx.fragment.app.b bVar, int i2) {
        setUpNavigationForResult(bVar, i2);
        navigateToDialogFragment(bVar);
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public void navigateToDialogFragment(androidx.fragment.app.b bVar) {
        bVar.show(this.fragmentManager, Integer.toString(this.fragmentManager.g()));
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public void navigateToWithoutBackSave(Fragment fragment, boolean z) {
        m b2;
        m a = this.fragmentManager.a();
        int i2 = this.enterAnimation;
        int i3 = this.exitAnimation;
        m r = a.r(i2, i3, i2, i3);
        if (z) {
            b2 = r.p(this.containerId, fragment);
        } else {
            b2 = r.b(this.containerId, fragment);
        }
        b2.h();
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public Fragment peekLast() {
        if (this.fragmentManager.g() <= 0) {
            return null;
        }
        return this.fragmentManager.e(this.fragmentManager.f(r0.g() - 1).getName());
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public boolean popBackStack() {
        return this.fragmentManager.n();
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public void popBackStackUntil(String str) {
        this.fragmentManager.m(str, 1);
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public void popDialogWithResult(Result result) {
        handleNavigationResult(result);
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public void popWithResult(Result result) {
        handleNavigationResult(result);
        popBackStack();
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public rx.e<Result> results(final int i2) {
        return this.resultRelay.D(new rx.m.e() { // from class: cm.aptoide.pt.navigator.d
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((Map) obj).containsKey(Integer.valueOf(i2)));
                return valueOf;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.navigator.e
            @Override // rx.m.e
            public final Object call(Object obj) {
                return FragmentResultNavigator.lambda$results$1(i2, (Map) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.navigator.f
            @Override // rx.m.b
            public final void call(Object obj) {
                FragmentResultNavigator.this.a(i2, (Result) obj);
            }
        });
    }

    @Override // cm.aptoide.pt.navigator.FragmentNavigator
    public Fragment getFragment(String str) {
        return this.fragmentManager.e(str);
    }
}
