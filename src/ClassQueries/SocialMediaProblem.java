package ClassQueries;

public class SocialMediaProblem {
	public static void main(String args[]) {
		String comments[] = { "Fantastic initiative", "Superb work", "Awesome job mate", "Good", "Bad work",
				"Worst content", "Fake post", "Incredible thought", "It's alright", "Doen't matter for me" };
		int l = comments.length;
		int g = good(comments, l);
		int b = bad(comments, l);
		int n = l - g - b;
		System.out.println("It has " + g + " Positive Comments among a total of " + l + " comments.");
		System.out.println("It has " + b + " Negative Comments among a total of " + l + " comments.");
		System.out.println("It has " + n + " Neutral Comments among a total of " + l + " comments.");
	}

	public static int good(String comments[], int l) {
		String response[] = { "Superb", "Fantastic", "Awesome", "Good", "Incredible" };
		int l2 = response.length;
		int count;
		int i, j;
		int arr[] = new int[l];
		int tot = 0;
		for (i = 0; i < l; i++) {
			count = 0;
			for (j = 0; j < l2; j++) {
				if (comments[i].contains(response[j])) {
					count++;
				}
			}
			arr[i] = count;
		}
		for (int m = 0; m < l; m++) {
			tot = arr[m] + tot;
		}
		return tot;
	}

	public static int bad(String comments[], int l) {
		String response[] = { "Bad", "Worst", "Fake" };
		int l2 = response.length;
		int count;
		int i, j;
		int arr[] = new int[l];
		int tot = 0;
		for (i = 0; i < l; i++) {
			count = 0;
			for (j = 0; j < l2; j++) {
				if (comments[i].contains(response[j])) {
					count++;
				}
			}
			arr[i] = count;
		}
		for (int m = 0; m < l; m++) {
			tot = arr[m] + tot;
		}
		return tot;
	}
}
