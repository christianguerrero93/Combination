# Combination

/*
	 * Combination
	 * ways to choose items where order doesn't matter
	 * C(n,k)  how many k can we choose out of n items
	 * C(n,k) = C(n-1, k-1) + C(n-1, k)
	 * k=n  choose all... only 1 way
	 * k=0 choose nothing... only 1 way
	 * k>n  trying to choose more than we have available ZERO WAYS
	 */
