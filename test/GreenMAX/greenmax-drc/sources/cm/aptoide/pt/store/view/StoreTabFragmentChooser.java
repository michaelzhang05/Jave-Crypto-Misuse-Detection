package cm.aptoide.pt.store.view;

import androidx.fragment.app.Fragment;
import cm.aptoide.pt.app.view.ListAppsFragment;
import cm.aptoide.pt.app.view.MoreBundleFragment;
import cm.aptoide.pt.dataprovider.model.v7.Event;
import cm.aptoide.pt.dataprovider.model.v7.Layout;
import cm.aptoide.pt.home.bundles.base.HomeEvent;
import cm.aptoide.pt.home.more.appcoins.EarnAppcListFragment;
import cm.aptoide.pt.home.more.apps.ListAppsMoreFragment;
import cm.aptoide.pt.store.view.my.MyStoresFragment;
import cm.aptoide.pt.store.view.my.MyStoresSubscribedFragment;
import cm.aptoide.pt.store.view.recommended.RecommendedStoresFragment;

/* loaded from: classes.dex */
public class StoreTabFragmentChooser {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.store.view.StoreTabFragmentChooser$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name;

        static {
            int[] iArr = new int[Event.Name.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name = iArr;
            try {
                iArr[Event.Name.listApps.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.getStore.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.getUser.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.getStoresRecommended.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.getMyStoresSubscribed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.myStores.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.getStoreWidgets.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.getMoreBundle.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.getAds.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.getAppCoinsAds.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.listStores.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.getReviews.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.listComments.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.listReviews.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static Fragment choose(Event event, HomeEvent.Type type) {
        switch (AnonymousClass1.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[event.getName().ordinal()]) {
            case 1:
                if ((event.getData() != null && event.getData().getLayout().equals(Layout.GRAPHIC)) || type.equals(HomeEvent.Type.MORE_TOP)) {
                    return ListAppsFragment.newInstance();
                }
                return new ListAppsMoreFragment();
            case 2:
            case 3:
                return GetStoreFragment.newInstance();
            case 4:
                return RecommendedStoresFragment.newInstance();
            case 5:
                return MyStoresSubscribedFragment.newInstance();
            case 6:
                return MyStoresFragment.newInstance();
            case 7:
                return GetStoreWidgetsFragment.newInstance();
            case 8:
                return new MoreBundleFragment();
            case 9:
                return new ListAppsMoreFragment();
            case 10:
                return new EarnAppcListFragment();
            case 11:
                return ListStoresFragment.newInstance();
            default:
                throw new RuntimeException("Fragment " + event.getName() + " not implemented!");
        }
    }

    public static boolean validateAcceptedName(Event.Name name) {
        if (name == null) {
            return false;
        }
        switch (AnonymousClass1.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[name.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            case 8:
            default:
                return false;
        }
    }
}
