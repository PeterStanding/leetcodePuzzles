/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    var p1 = await Promise.resolve(promise1);
    var p2 = await Promise.resolve(promise2);
    return p1 + p2;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */
 /*
    Used this to figure out the Async Await functions
    https://www.w3schools.com/js/js_async.asp

    Also looked into the hint sections as I've not encountered this before
 */
