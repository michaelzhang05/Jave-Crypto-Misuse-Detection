package cm.aptoide.pt.dataprovider.cache;

/* loaded from: classes.dex */
abstract class StringBaseCache<K, V> extends BaseCache<K, V, String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public StringBaseCache(KeyAlgorithm<K, String> keyAlgorithm) {
        super(keyAlgorithm);
    }

    @Override // cm.aptoide.pt.dataprovider.cache.Cache
    public boolean contains(K k2) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm != 0) {
            return contains((String) keyAlgorithm.getKeyFrom(k2));
        }
        throw new UnsupportedOperationException("Initialize cache using init() first");
    }

    abstract boolean contains(String str);

    @Override // cm.aptoide.pt.dataprovider.cache.Cache
    public V get(K k2) {
        if (this.keyAlgorithm != null) {
            if (isValid((StringBaseCache<K, V>) k2)) {
                return get((String) this.keyAlgorithm.getKeyFrom(k2), k2);
            }
            return null;
        }
        throw new UnsupportedOperationException("Initialize cache using init() first");
    }

    abstract V get(String str, K k2);

    @Override // cm.aptoide.pt.dataprovider.cache.Cache
    public boolean isValid(K k2) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm != 0) {
            String str = (String) keyAlgorithm.getKeyFrom(k2);
            return contains(str) && isValid(str);
        }
        throw new UnsupportedOperationException("Initialize cache using init() first");
    }

    abstract boolean isValid(String str);

    @Override // cm.aptoide.pt.dataprovider.cache.Cache
    public void put(K k2, V v) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm != 0) {
            put((String) keyAlgorithm.getKeyFrom(k2), (String) v);
            return;
        }
        throw new UnsupportedOperationException("Initialize cache using init() first");
    }

    abstract void put(String str, V v);

    @Override // cm.aptoide.pt.dataprovider.cache.Cache
    public void remove(K k2) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm != 0) {
            remove((String) keyAlgorithm.getKeyFrom(k2));
            return;
        }
        throw new UnsupportedOperationException("Initialize cache using init() first");
    }

    abstract void remove(String str);
}
