package cm.aptoide.pt.store.view;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import cm.aptoide.pt.AptoideApplication;
import cm.aptoide.pt.NavigationTrackerPagerAdapterHelper;
import cm.aptoide.pt.dataprovider.model.v7.Event;
import cm.aptoide.pt.dataprovider.model.v7.store.GetStoreTabs;
import cm.aptoide.pt.dataprovider.ws.v7.store.StoreContext;
import cm.aptoide.pt.view.Translator;
import cm.aptoide.pt.view.fragment.NavigationTrackFragment;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class StorePagerAdapter extends androidx.fragment.app.l implements NavigationTrackerPagerAdapterHelper {
    private final EnumMap<Event.Name, Integer> availableEventsMap;
    private Context context;
    private final String marketName;
    private final StoreContext storeContext;
    private Long storeId;
    private String storeTheme;
    private final List<GetStoreTabs.Tab> tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.store.view.StorePagerAdapter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Type;

        static {
            int[] iArr = new int[Event.Name.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name = iArr;
            try {
                iArr[Event.Name.myStores.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.getReviews.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Event.Type.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Type = iArr2;
            try {
                iArr2[Event.Type.API.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Type[Event.Type.CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Type[Event.Type.v3.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public StorePagerAdapter(androidx.fragment.app.h hVar, List<GetStoreTabs.Tab> list, StoreContext storeContext, Long l, String str, Context context, String str2) {
        super(hVar);
        this.availableEventsMap = new EnumMap<>(Event.Name.class);
        this.storeId = l;
        if (l != null && l.longValue() != 15) {
            this.storeTheme = str;
        }
        this.tabs = list;
        this.storeContext = storeContext;
        this.context = context;
        this.marketName = str2;
        translateTabs(list);
        validateGetStore();
        fillAvailableEventsMap(list);
    }

    private Fragment caseAPI(GetStoreTabs.Tab tab, boolean z) {
        return AptoideApplication.getFragmentProvider().newStoreTabGridRecyclerFragment(tab.getEvent(), this.storeTheme, tab.getTag(), this.storeContext, z, false);
    }

    private Fragment caseClient(Event event, GetStoreTabs.Tab tab) {
        if (AnonymousClass1.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[event.getName().ordinal()] == 1) {
            return AptoideApplication.getFragmentProvider().newSubscribedStoresFragment(event, this.storeTheme, tab.getTag(), this.storeContext);
        }
        throw new RuntimeException("Fragment type not implemented!");
    }

    private Fragment caseV3(Event event) {
        if (AnonymousClass1.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[event.getName().ordinal()] == 2) {
            return AptoideApplication.getFragmentProvider().newLatestReviewsFragment(this.storeId.longValue(), this.storeContext);
        }
        throw new RuntimeException("Fragment type not implemented!");
    }

    private void fillAvailableEventsMap(List<GetStoreTabs.Tab> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Event event = list.get(i2).getEvent();
            if (!containsEventName(event.getName())) {
                this.availableEventsMap.put((EnumMap<Event.Name, Integer>) event.getName(), (Event.Name) Integer.valueOf(i2));
            }
        }
    }

    private boolean isHomeFragment(int i2) {
        return i2 == 0;
    }

    private Fragment setFragmentLogFlag(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean(NavigationTrackFragment.SHOULD_REGISTER_VIEW, false);
        fragment.setArguments(arguments);
        return fragment;
    }

    private void translateTabs(List<GetStoreTabs.Tab> list) {
        for (GetStoreTabs.Tab tab : list) {
            tab.setLabel(Translator.translate(tab.getLabel(), this.context, this.marketName));
        }
    }

    private void validateGetStore() {
        Iterator<GetStoreTabs.Tab> it = this.tabs.iterator();
        while (it.hasNext()) {
            GetStoreTabs.Tab next = it.next();
            if (next.getEvent().getName() == null || next.getEvent().getType() == null) {
                it.remove();
            }
        }
    }

    public boolean containsEventName(Event.Name name) {
        return this.availableEventsMap.containsKey(name);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.tabs.size();
    }

    public int getEventNamePosition(Event.Name name) {
        Integer num = this.availableEventsMap.get(name);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.fragment.app.l
    public Fragment getItem(int i2) {
        Fragment caseAPI;
        GetStoreTabs.Tab tab = this.tabs.get(i2);
        Event event = tab.getEvent();
        int i3 = AnonymousClass1.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Type[event.getType().ordinal()];
        if (i3 == 1) {
            caseAPI = caseAPI(tab, isHomeFragment(i2));
        } else if (i3 == 2) {
            caseAPI = caseClient(event, tab);
        } else if (i3 == 3) {
            caseAPI = caseV3(event);
        } else {
            throw new RuntimeException("Fragment type not implemented!");
        }
        return setFragmentLogFlag(caseAPI);
    }

    @Override // cm.aptoide.pt.NavigationTrackerPagerAdapterHelper
    public String getItemName(int i2) {
        return getItem(i2).getClass().getSimpleName();
    }

    @Override // cm.aptoide.pt.NavigationTrackerPagerAdapterHelper
    public StoreContext getItemStore() {
        return this.storeContext;
    }

    @Override // cm.aptoide.pt.NavigationTrackerPagerAdapterHelper
    public String getItemTag(int i2) {
        return this.tabs.get(i2).getLabel();
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence getPageTitle(int i2) {
        return this.tabs.get(i2).getLabel();
    }
}
