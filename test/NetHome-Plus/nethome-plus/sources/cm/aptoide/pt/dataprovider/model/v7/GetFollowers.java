package cm.aptoide.pt.dataprovider.model.v7;

import cm.aptoide.pt.dataprovider.model.v7.TimelineStats;
import cm.aptoide.pt.dataprovider.model.v7.store.Store;

/* loaded from: classes.dex */
public class GetFollowers extends BaseV7EndlessDataListResponse<TimelineUser> {

    /* loaded from: classes.dex */
    public static class TimelineUser {
        String avatar;
        long id;
        String name;
        TimelineStats.StatusData stats;
        Store store;

        protected boolean canEqual(Object obj) {
            return obj instanceof TimelineUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TimelineUser)) {
                return false;
            }
            TimelineUser timelineUser = (TimelineUser) obj;
            if (!timelineUser.canEqual(this) || getId() != timelineUser.getId()) {
                return false;
            }
            String name = getName();
            String name2 = timelineUser.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = timelineUser.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            Store store = getStore();
            Store store2 = timelineUser.getStore();
            if (store != null ? !store.equals(store2) : store2 != null) {
                return false;
            }
            TimelineStats.StatusData stats = getStats();
            TimelineStats.StatusData stats2 = timelineUser.getStats();
            return stats != null ? stats.equals(stats2) : stats2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public long getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public TimelineStats.StatusData getStats() {
            return this.stats;
        }

        public Store getStore() {
            return this.store;
        }

        public int hashCode() {
            long id = getId();
            String name = getName();
            int hashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (name == null ? 43 : name.hashCode());
            String avatar = getAvatar();
            int hashCode2 = (hashCode * 59) + (avatar == null ? 43 : avatar.hashCode());
            Store store = getStore();
            int hashCode3 = (hashCode2 * 59) + (store == null ? 43 : store.hashCode());
            TimelineStats.StatusData stats = getStats();
            return (hashCode3 * 59) + (stats != null ? stats.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(long j2) {
            this.id = j2;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setStats(TimelineStats.StatusData statusData) {
            this.stats = statusData;
        }

        public void setStore(Store store) {
            this.store = store;
        }

        public String toString() {
            return "GetFollowers.TimelineUser(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ", store=" + getStore() + ", stats=" + getStats() + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessDataListResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public boolean canEqual(Object obj) {
        return obj instanceof GetFollowers;
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessDataListResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetFollowers) && ((GetFollowers) obj).canEqual(this);
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessDataListResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public int hashCode() {
        return 1;
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessDataListResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public String toString() {
        return "GetFollowers()";
    }
}
