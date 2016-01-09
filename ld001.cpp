/*************************************************************************
    > File Name: ld001.cpp
    > Author: ihochang
    > Mail: 1292496376@qq.com 
    > Created Time: Tue Jun 16 17:55:11 2015
 ************************************************************************/

#include<iostream>
#include<map>
#include<vector>
using namespace std;
class Solution{
	public:
		map<int,int> saveNum;
		int otherNum;
		int posNum;
		vector<int> result;

		vector<int> twoSum(vector<int>& nums, int target){
			for (int i = 0;i<nums.size();i++){
				saveNum[nums[i]]=i;
			}
			for (int i =0;i<nums.size()-1;i++){
				otherNum = target-saveNum[i];
				if (saveNum.find(otherNum)!=saveNum.end()){
					if (i!=otherNum){
						result.push_back(i+1);
						result.push_back(otherNum+1);
						break;

					}
				}
			}
			return result;
		}
};
int main(){
    int testNum[] = {2,7,11,15};
	int len = sizeof(testNum);
	vector <int> nums(testNum,testNum+len);
    vector<int> answer;
	Solution test;
	answer = test.twoSum(nums,9);
	cout<<
	//for (int i=0;i<1;i++){
	//	cout<<"index="<<answer[i]<<",";
	//}
	//
	cout<<answer[0]<<answer[1];
	return 0;
}
