package twitterspammerdetection;

import java.io.IOException;

public class Main_Class {

	public static void main(String[] args)throws IOException,	InterruptedException 
	{
		
					//Metadata-Based Features		
					//Metadata_Category.retweetRatio();
					//Metadata_Category.automatedTweetRatio();
					//Metadata_Category.tweetsTimeIntervalAndTheirAverage();
					///Metadata_Category.tweetsTimeIntervalStandardDeviation();
					/*Metadata_Category.tweetsTimeStandardDeviation();
					
					
					//Content-Based Features*/
					//Content_Category.UR_MR_UUR_UMR_HTR();
					//Content_Category.tweetHashtagSimilarityRatio();
					//Content_Category.AUR_ATS();
					
					
					//Network-Based Features
					//network.Unique_ip_Ratio();
					
					//Interaction-Based Features
					//Interaction_Category.reputation_and_followerRatio();
					//Interaction_Category.clus_coefficient();
					//Interaction_Category.Friends_Fol_And_Neighbors_Flng_Extraction();
					//Interaction_Category.followerBasedReputation();
					//Interaction_Category.meanFollowersFollowingToFollowerRatio();
					
					//Execute the below three methods in sequence to compute community-based users' reputation
					//After executing followersFolllowersAndFollowings(), pass its output to CONCLUDE algorithm to find the communities of every user
					
					//Community_Category.followersFolllowersAndFollowings();
					//Community_Category.communityUsersReputation();
					//Community_Category.communityBasedUsersReputation();
					
					//Execute this method to compute community-based clustering coefficient
					Community_Category.communityBasedClusteringCoefficient();
					

	}
}

